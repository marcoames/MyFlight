package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public void adicionar(Voo voo) {
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodas() {
        ArrayList<Voo> aux = new ArrayList<>();
        for (Voo voo1  : voos)
            aux.add(voo1);
        return aux;
    }

    public ArrayList<Voo> buscarData(LocalDateTime data) {
        for (Voo voo1 : voos) {
            if (voo1.getDataHora().equals(data))
                return voos;
        }
        return null;
    }

}
