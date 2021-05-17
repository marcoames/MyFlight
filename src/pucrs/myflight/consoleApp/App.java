package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.*;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) throws IOException {
		System.out.println("MyFlight project....");

	/*

		//Cria cias aéreas
		CiaAerea c1 = new CiaAerea("JJ","LATAM Linhas Aéreas");
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea c3 = new CiaAerea("TP","TAP Portugal");
		CiaAerea c4 = new CiaAerea("AD","Azul Linhas Aéreas");

		//Cria aeronaves
		Aeronave a1 = new Aeronave("733","Boeing 737-300",140);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-700",126);
		Aeronave a3 = new Aeronave("380", "Airbus Industrie A380",644);
		Aeronave a4 = new Aeronave("764", "Boeing 767-400",304);

		//Cria Geo dos aeroportos
		Geo localPoa = new Geo(-29.9939,-51.1711);
		Geo localSp = new Geo(-23.4356,-46.4731);
		Geo localLs = new Geo(38.7742,-9.1342);
		Geo localMi = new Geo(25.7933,-80.2906);

		//Cria aeroportos
		Aeroporto portoAlegre = new Aeroporto("POA","Salgado Filho", localPoa);
		Aeroporto saoPaulo = new Aeroporto("GRU","Guarulhos",localSp);
		Aeroporto lisbon = new Aeroporto("LIS","Lisbon",localLs);
		Aeroporto miami = new Aeroporto("MIA","Miami",localMi);

		double distanciaGeo = Geo.distancia(portoAlegre.getLocal(),saoPaulo.getLocal());
		System.out.println("Distancia entre POA e SP: " + distanciaGeo);

		//Cria rotas
		Rota r1 = new Rota(c2,saoPaulo,portoAlegre,a2);
		Rota r2 = new Rota(c2,portoAlegre,saoPaulo,a2);
		Rota r3 = new Rota(c3,miami,lisbon,a1);
		Rota r4 = new Rota(c1,saoPaulo,miami,a3);

		//Cria Voos
		Voo v1 = new Voo(r1,LocalDateTime.of(2016,8,10,8,0),Duration.ofMinutes(90));
		v1.setStatus(Voo.Status.ATRASADO);
		Voo v2 = new Voo(r2,LocalDateTime.of(2016,8,10,15,0),Duration.ofMinutes(120));
		v2.setStatus(Voo.Status.CONFIRMADO);
		Voo v3 = new VooEscalas(r1,r2,LocalDateTime.now(),Duration.ofMinutes(60));

		System.out.println("Voo1: " + v1);
		System.out.println("Voo2: " + v2);
		System.out.println("Voo3: " + v3);

	*/

		GerenciadorCias empresas = new GerenciadorCias();
		empresas.carregaDados();
		empresas.listarTodas();

		GerenciadorAeroportos aeroportos = new GerenciadorAeroportos();
		aeroportos.carregaDados();
		aeroportos.listarTodas();

		GerenciadorAeronaves aeronaves = new GerenciadorAeronaves();
		aeronaves.carregaDados();
		aeronaves.listarTodas();
	}
}