package com.example.ficha1_mod10_ricardosilva_3016;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.ViewHolder> {

        private ArrayList<Jogador> listaJogadores;
        Context context;

        public MeuAdapter(ArrayList<Jogador> listaJogadores){
                this.listaJogadores = listaJogadores;
        }

        @NonNull
        @Override
        public MeuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_jogador, parent,false);
                return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

                String nome = String.valueOf(listaJogadores.get(position).getNome());
                String idade = String.valueOf(listaJogadores.get(position).getIdade());
                String equipa = String.valueOf(listaJogadores.get(position).getEquipa());
                String nCamisola = String.valueOf(listaJogadores.get(position).getNumeroCamisola());
                holder.lblNome.setText(nome);
                holder.lblIdade.setText(idade);
                holder.lblEquipa.setText(equipa);
                holder.lblCamisola.setText(nCamisola);
        }

        @Override
        public int getItemCount() {
                return listaJogadores.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder{
                TextView lblNome,lblIdade,lblEquipa,lblCamisola;
                public ViewHolder(@NonNull View itemView) {
                        super(itemView);
                        lblNome = itemView.findViewById(R.id.lblNome);
                        lblIdade = itemView.findViewById(R.id.lblIdade);
                        lblEquipa = itemView.findViewById(R.id.lblEquipa);
                        lblCamisola = itemView.findViewById(R.id.lblNumeroCamisola);
                }
        }
}
