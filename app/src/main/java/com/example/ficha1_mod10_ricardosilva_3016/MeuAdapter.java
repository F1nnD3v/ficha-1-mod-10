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

        String nomes[],equipas[];
        int idades[],numerosCamisolas[];
        Context context;

        public MeuAdapter(Context ct, String nomes[], int idades[], String equipas[], int numerosCamisolas[]){
                this.context = ct;
                this.nomes = nomes;
                this.idades = idades;
                this.equipas = equipas;
                this.numerosCamisolas = numerosCamisolas;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                LayoutInflater inflater = LayoutInflater.from(context);
                View view = inflater.inflate(R.layout.rv_jogador, parent,false);
                return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
                holder.lblNome.setText(nomes[position]);
                holder.lblIdade.setText(idades[position]);
                holder.lblEquipa.setText(equipas[position]);
                holder.lblCamisola.setText(numerosCamisolas[position]);
        }

        @Override
        public int getItemCount() {
                return nomes.length;
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
