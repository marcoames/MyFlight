package pucrs.myflight.modelo;

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
		for (CiaAerea cia : empresas)
			aux.add(cia);
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

}
