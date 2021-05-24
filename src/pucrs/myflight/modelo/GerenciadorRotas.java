package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        for (Rota rts : Rotas) {
            System.out.println("rotas: " + rts.getCia().toString() + "," + rts.getOrigem().toString() + "," + rts.getDestino().toString() + ","
                    + rts.getAeronave().toString());
            aux.add(rts);
        }
        return aux;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig) {
        for (Rota rts : Rotas){
            if (rts.getOrigem().equals(orig))
                return Rotas;
        }
        return null;
    }

    public void carregaDados() throws IOException {
        Path path1 = Paths.get("routes.dat");
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            reader.readLine(); // Ignora 1 linha
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");

                GerenciadorCias gerCias = new GerenciadorCias();
                gerCias.carregaDados();

                CiaAerea cia = gerCias.buscarCodigo(dados[0]);

                GerenciadorAeroportos gerAero = new GerenciadorAeroportos();
                gerAero.carregaDados();

                Aeroporto origem = gerAero.buscarPorCodigo(dados[1]);
                Aeroporto destino = gerAero.buscarPorCodigo(dados[2]);

                GerenciadorAeronaves gerAvioes = new GerenciadorAeronaves();
                gerAvioes.carregaDados();

                Aeronave aero = gerAvioes.buscarPorCodigo(dados[5]);

                Rota rts = new Rota(cia,origem,destino,aero);
                Rotas.add(rts);
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
}
