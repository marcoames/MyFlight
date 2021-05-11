package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> Aeronaves;

    public GerenciadorAeronaves(){
        Aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao) {
        Aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas() {
        ArrayList<Aeronave> aux = new ArrayList<Aeronave>();
        for(Aeronave aNav : Aeronaves)
            aux.add(aNav);
        return aux;
    }

    public Aeronave buscarPorCodigo(String cod) {
        for (Aeronave aero: Aeronaves) {
            if (aero.getCodigo().equals(cod))
                return aero;
        }
        return null;
    }
}
