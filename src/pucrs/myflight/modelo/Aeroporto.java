package pucrs.myflight.modelo;

public class Aeroporto implements Contavel, Comparable<Aeroporto>{
	private String codigo;
	private String nome;
	private Geo loc;
	private String pais;

	private static int total = 0;
	
	public Aeroporto(String codigo, String nome, Geo loc, String pais) {
		total++;
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
		this.pais = pais;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public String getPais() {
		return pais;
	}

	public Geo getLocal() {
		return loc;
	}

	@Override
	public int compareTo(Aeroporto a1) {
		return 0;
	}
}
