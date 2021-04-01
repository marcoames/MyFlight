package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> Rotas;

    public GerenciadorRotas() {
        Rotas = new ArrayList<>();
    }

    public ArrayList<Rota> listarTodas(){
        ArrayList<Rota> aux = new ArrayList<Rota>();
        for (Rota rts : Rotas)
            aux.add(rts);
        return aux;
    }
}
