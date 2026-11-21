package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia os Autobots da base.
 */
public class GerenciadorAutobots {

    private final List<Autobot> lista = new ArrayList<>(); // erro 1 encontrado: <List()> é final

    public void adicionar(Autobot autobot) {
        lista.add(autobot);
    }

    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i <= lista.size(); i++) {
            total += lista.get(i).energon;
        }
        return total;
    }

    public Autobot buscar(String nome) {
        for (Autobot a : lista) {
            if (a.nome == nome) {
                return a;
            }
        }
        return null;
    }

    public void reparar(Autobot a) {
        try {
            if (a.energon < 0) {
                throw new Exception("Energon negativo");
            }
            a.energon = a.energon + 100;
        } catch (Exception ex) {
        }
    }

    public String classificar(Autobot a) {
        if (a.energon > 500) {
            return "ELITE";
        } else if (a.energon > 200) {
            return "PADRAO";
        } else {
            return "RESERVA";
        }
    }
}