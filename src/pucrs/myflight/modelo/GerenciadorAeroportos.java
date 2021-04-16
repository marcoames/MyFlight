package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> Aeroportos;

    public GerenciadorAeroportos() {
        Aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aero) {
        Aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodas() {
        ArrayList<Aeroporto> aux = new ArrayList<Aeroporto>();
        for(Aeroporto aero : Aeroportos)
            aux.add(aero);
        return aux;
    }

    public Aeroporto buscarPorCodigo(String cod) {
        for (Aeroporto aero: Aeroportos) {
            if (aero.getCodigo().equals(cod))
                return aero;
        }
        return null;
    }

}
