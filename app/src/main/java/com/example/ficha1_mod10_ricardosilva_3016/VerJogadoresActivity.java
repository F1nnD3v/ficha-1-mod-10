package com.example.ficha1_mod10_ricardosilva_3016;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class VerJogadoresActivity extends AppCompatActivity {
    String[] dadosJogadores;
    RecyclerView recyclerView;
    RecyclerView.Adapter adaptador;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_jogadores);

        Bundle args = getIntent().getBundleExtra("ArrayJogadores");
        ArrayList<Jogador> jogadores = (ArrayList<Jogador>) args.getSerializable("ArrayList");

        recyclerView = findViewById(R.id.rvJogadores);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adaptador = new RecyclerView.Adapter(dadosJogadores);
        recyclerView.setAdapter(adaptador);
    }
}