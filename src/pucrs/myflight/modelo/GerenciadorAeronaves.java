package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> Aeronaves;

    public GerenciadorAeronaves(){
        Aeronaves = new ArrayList<>();
    }

    public ArrayList<Aeronave> listarTodas(){
        ArrayList<Aeronave> aux = new ArrayList<Aeronave>();
        for(Aeronave cia : Aeronaves)
            aux.add(cia);
        return aux;
    }
}
