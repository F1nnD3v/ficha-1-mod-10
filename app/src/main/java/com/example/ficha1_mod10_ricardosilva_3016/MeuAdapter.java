package com.example.ficha1_mod10_ricardosilva_3016;

import android.content.Context;
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
                return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
                return 0;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder{

                public ViewHolder(@NonNull View itemView) {
                        super(itemView);
                }
        }
}
