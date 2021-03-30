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

	public double distancia(Geo ponto1, Geo ponto2) {
	double cos1 = Math.cos(Math.toRadians(ponto1.latitude));  // Coseno do ponto1 transformado de graus em radianos
	double cos2 = Math.cos(Math.toRadians(ponto2.latitude));  // Coseno do ponto2 transformado de graus em radianos
    double sen1 = Math.sin(Math.toRadians(ponto1.longitude)); // Seno do ponto1 transformado de graus em radianos
	double sen2 = Math.sin(Math.toRadians(ponto2.longitude)); // Seno do ponto2 transformado de graus em radianos

	double aux = Math.pow(cos2 - cos1 / 2, 2) +
				 Math.pow(sen2 - sen1 / 2, 2) *
				 cos1 * cos2;
	double raio = 6371;
	double dist = 	2 * Math.asin(Math.sqrt(aux));
	return dist;

	}
}
