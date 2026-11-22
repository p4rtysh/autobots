package com.cybertron.autobot;

/**
 * Representa um Autobot da base. Os atributos são protegidos e acessados pelos métodos Getters (pensando em escalabilidade do projeto)
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