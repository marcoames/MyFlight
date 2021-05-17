package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        for (Aeroporto aero : Aeroportos) {
            System.out.println(aero.getCodigo() + "," + aero.getNome() + "," + aero.getPais() + "," + aero.getLocal().toString());
            aux.add(aero);
        }
        return aux;
    }

    public Aeroporto buscarPorCodigo(String cod) {
        for (Aeroporto aero: Aeroportos) {
            if (aero.getCodigo().equals(cod))
                return aero;
        }
        return null;
    }

    public ArrayList<Aeroporto> ordenaNome(){
        ArrayList<Aeroporto> aux = new ArrayList<>();
        aux.sort(Aeroporto::compareTo);
        return aux;
    }

    public void carregaDados() throws IOException {
        Path path1 = Paths.get("src/pucrs/myflight/modelo/airports.dat");
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            reader.readLine(); // Ignora 1 linha
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                String codigo = dados[0];
                double latitude = Double.parseDouble(dados[1]);
                double longitude = Double.parseDouble(dados[2]);
                String nome = dados[3];
                String pais = dados[4];
                Geo loc = new Geo(latitude,longitude);
                Aeroporto aero = new Aeroporto(codigo,nome,loc,pais);
                Aeroportos.add(aero);
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
}
