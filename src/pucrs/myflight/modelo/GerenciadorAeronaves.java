package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        for(Aeronave aero : Aeronaves) {
            System.out.println(aero.getCodigo() + "," + aero.getDescricao() + "," + aero.getCapacidade());
            aux.add(aero);
        }
        return aux;
    }

    public Aeronave buscarPorCodigo(String cod) {
        for (Aeronave aero: Aeronaves) {
            if (aero.getCodigo().equals(cod))
                return aero;
        }
        return null;
    }

    public void carregaDados() throws IOException {
        Path path1 = Paths.get("src/pucrs/myflight/modelo/equipment.dat");
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            reader.readLine(); // Ignora 1 linha
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                String codigo = dados[0];
                String descricao = dados[1];
                int capacidade  = Integer.parseInt(dados[2]);
                Aeronave aero = new Aeronave(codigo,descricao,capacidade);
                Aeronaves.add(aero);
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
}
