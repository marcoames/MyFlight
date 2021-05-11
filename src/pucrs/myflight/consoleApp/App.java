package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;

public class App {

	public static void main(String[] args) {
		System.out.println("MyFlight project...");

		//Cria cias aéreas
		CiaAerea c1 = new CiaAerea("JJ","LATAM Linhas Aéreas");
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");

		//Cria aeronaves
		Aeronave a1 = new Aeronave("733","Boeing 737-300",140);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-700",126);

		//Cria Geo dos aeroportos
		Geo localPoa = new Geo(-29.9939,-51.1711);
		Geo localSp = new Geo(-23.4356,-46.4731);

		Aeroporto portoAlegre = new Aeroporto("POA","Salgado Filho", localPoa);
		Aeroporto saoPaulo = new Aeroporto("GRU","Guarulhos",localSp);

		double distanciaGeo = Geo.distancia(portoAlegre.getLocal(),saoPaulo.getLocal());
		System.out.println("Distancia entre POA e SP: " + distanciaGeo);

	}
}