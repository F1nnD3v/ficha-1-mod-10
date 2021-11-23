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

        for (int i = 0;i< jogadores.size(); i++){
            MeuAdapter meuAdapter = new MeuAdapter(this, jogadores.get(i).getNome()x)
        }
    }
}