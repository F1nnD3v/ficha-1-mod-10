package com.example.ficha1_mod10_ricardosilva_3016;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class VerJogadoresActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adaptador;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_jogadores);

        recyclerView= findViewById(R.id.rvJogadores);
        Bundle args = getIntent().getBundleExtra("ArrayJogadores");
        ArrayList<Jogador> jogadores = (ArrayList<Jogador>) args.getSerializable("ArrayList");
        Button btnVoltar = findViewById(R.id.btnVoltar);

        MeuAdapter meuAdapter = new MeuAdapter(jogadores);

        recyclerView.setAdapter(meuAdapter);
        recyclerView.setLayoutManager(layoutManager);
        setAdapter(jogadores);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void setAdapter(ArrayList<Jogador> jogadores){
        MeuAdapter adapter = new MeuAdapter(jogadores);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}