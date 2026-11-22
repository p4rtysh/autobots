package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia os Autobots da base, calcula os Energon de cada autobot, busca por autobot na lista, repara e classifica os autobots.
 */
public class GerenciadorAutobots {

    private final List<Autobot> lista = new ArrayList<>(); // erro 1 encontrado: <List()> é final (boas praticas)

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
        for (Autobot autobot : lista) {
            if (autobot.nome.equals(nome)) { // erro 2 encontrado: string n usa '==', usa equals
                return autobot;
            }
        }
        return null;
    }

    public void reparar(Autobot autobot) {
        try {
            if (autobot.energon < 0) {
                throw new Exception("Energon negativo");
            }
            autobot.energon = autobot.energon + 100;
        } catch (Exception ex) { // erro 3 encontrado: catch vazio!!!!! absurdo
                throw new RuntimeException("Não foi possível reparar o autobot. Tente novamente.");
        } // usei o RuntimeException para não apagar o erro do exception ali em cima
          // e mostrar os dois erros. isso tbm fica melhor de debuggar depois;
    }

    public String classificar(Autobot autobot) {
        if (autobot.energon > 500) {
            return "ELITE";
        } else if (autobot.energon > 200) {
            return "PADRAO";
        } else {
            return "RESERVA";
        }
    }
}