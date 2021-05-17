package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo ponto1, Geo ponto2) {

		//Transforma em radianos
		double lat1 = Math.toRadians(ponto1.getLatitude());
		double lat2 = Math.toRadians(ponto2.getLatitude());
		double lon1 = Math.toRadians(ponto1.getLongitude());
		double lon2 = Math.toRadians(ponto2.getLongitude());

		//Calcula seno e cosseno
		double senLat = Math.sin(lat1 - lat2 / 2);
		double senLon = Math.sin(lon1 - lon2 / 2);
		double cos1 = Math.cos(lat1);
		double cos2 = Math.cos(lat2);

		//Resolve a equação dentro da raiz
		double aux = Math.pow(senLat, 2) +
					 Math.pow(senLon, 2) *
					 cos1 * cos2;

		double raio = 6371; //Raio da Terra
		return 2 * Math.asin(Math.sqrt(aux));
	}

	@Override
	public String toString() {
		return latitude + "," + longitude ;
	}
}
