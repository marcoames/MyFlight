package pucrs.myflight.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas() {
		ArrayList<CiaAerea> aux = new ArrayList<>();
		for (CiaAerea cia : empresas) {
			System.out.println(cia.getCodigo() + "," + cia.getNome());
			aux.add(cia);
		}
		return aux;
	}

	public CiaAerea buscarCodigo(String cod) {
		for (CiaAerea cia : empresas) {
			if (cia.getCodigo().equals(cod))
				return cia;
		}
		return null;
	}

	public CiaAerea buscarNome(String nome) {
		for (CiaAerea cia : empresas) {
			if (cia.getNome().equals(nome))
				return cia;
		}
		return null;
	}

	public void carregaDados() throws IOException {
		Path path1 = Paths.get("src/pucrs/myflight/modelo/airlines.dat");
		try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
			reader.readLine(); // Ignora 1 linha
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] dados = line.split(";");
				String codigo = dados[0];
				String nome = dados[1];
				CiaAerea cia = new CiaAerea(codigo,nome);
				empresas.add(cia);
			}
		}
		catch (IOException x) {
			System.err.format("Erro de E/S: %s%n", x);
		}
	}

}
