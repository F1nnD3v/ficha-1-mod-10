package com.example.ficha1_mod10_ricardosilva_3016;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variáveis
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();


        //Buttons
        Button btnInserir = findViewById(R.id.btnInserir);
        Button btnVerJogadores = findViewById(R.id.btnVerJogadores);

        //Text boxes
        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtIdade = findViewById(R.id.txtIdade);
        EditText txtEquipa = findViewById(R.id.txtEquipa);
        EditText txtNumeroCamisola = findViewById(R.id.txtNúmeroCamisola);


        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValidarJogador(txtNome);
                ValidarJogador(txtIdade);
                ValidarJogador(txtEquipa);
                ValidarJogador(txtNumeroCamisola);

                Jogador jogador = new Jogador(txtNome.getText().toString(), Integer.parseInt(txtIdade.getText().toString()), txtEquipa.getText().toString(), Integer.parseInt(txtNumeroCamisola.getText().toString()));
                jogadores.add(jogador);
            }
        });

        btnVerJogadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,VerJogadoresActivity.class);
                Bundle args = new Bundle();
                args.putSerializable("ArrayList",(Serializable)jogadores);
                intent.putExtra("ArrayJogadores",args);
            }
        });

    }
    public void ValidarJogador(EditText txtBox){
        if(txtBox.getText().length() == 0){
            Toast.makeText(getApplicationContext(), "A caixa de texto '" + txtBox.getHint().toString() + "' deve ser preenchida", Toast.LENGTH_LONG).show();
            return;
        }
    }
}