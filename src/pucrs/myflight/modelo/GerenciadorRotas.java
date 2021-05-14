package pucrs.myflight.modelo;

import java.util.ArrayList;

public class    GerenciadorRotas {
    private ArrayList<Rota> Rotas;

    public GerenciadorRotas() {
        Rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota) {
        Rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas() {
        ArrayList<Rota> aux = new ArrayList<Rota>();
        for (Rota rts : Rotas)
            aux.add(rts);
        return aux;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig) {
        for (Rota rts : Rotas){
            if (rts.getOrigem().equals(orig))
                return Rotas;
        }
        return null;
    }

}
