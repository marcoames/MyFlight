package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo(Rota rota, Duration duracao) {
		this.rota = rota;
		this.datahora = LocalDateTime.of(2016,8,12,12,00,00);
		this.duracao = duracao;
		this.status = Status.CONFIRMADO;
	}

	
	public Rota getRota() {
		return rota;
	}
	
	public LocalDateTime getDataHora() {
		return datahora;
	}
	
	public Duration getDuracao() {
		return duracao;
	}
	
	public Status getStatus() {
		return status;
	}

	//Muda status do Voo
	public void setStatus(Status novo) {
		this.status = novo;
	}

	@Override
	public String toString() {
		return "Voo{ " + "datahora=" + datahora + ", duracao=" + duracao + ", rota=" + rota + ", status=" + status + '}';
	}

}
