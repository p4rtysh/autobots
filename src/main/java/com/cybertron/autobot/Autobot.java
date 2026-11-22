package com.cybertron.autobot;

/**
 * Representa um Autobot da base. Os atributos são protegidos e acessados pelos métodos Getters (pensando em escalabilidade do projeto)
 */
public class Autobot {

    protected String nome; // tudo publico aqui, falha de segurança!!!!
    protected double energon; // ou seja, erro 5 encontrado: atributos publicos é algo perigoso
    protected int nivel; // entao deixei eles protected, para que a classe GerenciadorAutobots possa acessar mas
                        // nao possa alterar
    public String getNome() {
        return nome;
    }

    public double getEnergon() {
        return energon;
    }

    public int getNivel() {
        return nivel;
    }

    public Autobot(String nome, double energon, int nivel) {
        this.nome = nome;
        this.energon = energon;
        this.nivel = nivel;
    }
}