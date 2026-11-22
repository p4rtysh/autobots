package com.cybertron.autobot;

/**
 * Ponto de entrada da base dos Autobots. Adiciona novos autobots à base.
 */
public class Main {

    public static void main(String[] args) {

        GerenciadorAutobots gerenciador = new GerenciadorAutobots();

        Autobot optimus = new Autobot("Optimus Prime", 850.0, 10);
        Autobot bumblebee = new Autobot("Bumblebee", 320.0, 5);
        Autobot ratchet = new Autobot("Ratchet", 180.0, 7);

        gerenciador.adicionar(optimus);
        gerenciador.adicionar(bumblebee);
        gerenciador.adicionar(ratchet);

        Autobot encontrado = gerenciador.buscar("Bumblebee");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.nome);
        } else {
            System.out.println("Autobot nao encontrado");
        }

        gerenciador.reparar(ratchet);
        System.out.println("Energon do Ratchet: " + ratchet.energon);
        System.out.println("Classificacao: " + gerenciador.classificar(ratchet));
    }
}