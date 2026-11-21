package com.cybertron.autobot;

/**
 * Representa um Autobot da base.
 */
public class Autobot {

    public String nome;
    public double energon;
    public int nivel;

    public Autobot(String nome, double energon, int nivel) {
        this.nome = nome;
        this.energon = energon;
        this.nivel = nivel;
    }
}