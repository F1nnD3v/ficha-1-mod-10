package com.example.ficha1_mod10_ricardosilva_3016;

import java.io.Serializable;

public class Jogador implements Serializable {
    private String nome;
    private int idade;
    private String equipa;
    private int numeroCamisola;

    public Jogador(String nome, int idade, String equipa, int numeroCamisola){
        this.nome = nome;
        this.idade = idade;
        this.equipa = equipa;
        this.numeroCamisola = numeroCamisola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEquipa() {
        return equipa;
    }

    public void setEquipa(String equipa) {
        this.equipa = equipa;
    }

    public int getNumeroCamisola() {
        return numeroCamisola;
    }

    public void setNumeroCamisola(int numeroCamisola) {
        this.numeroCamisola = numeroCamisola;
    }
}
