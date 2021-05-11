package pucrs.myflight.modelo;

public class Aeroporto implements Contavel, Comparable<Aeroporto>{
	private String codigo;
	private String nome;
	private Geo loc;

	private static int total = 0;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		total++;
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	@Override
	public int compareTo(Aeroporto a1) {
		return 0;
	}
}
