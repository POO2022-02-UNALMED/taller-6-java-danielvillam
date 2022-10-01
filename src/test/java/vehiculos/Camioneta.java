package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo{
	
	private boolean volco;
	private static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.setVolco(volco);
		listado.add(this);
	}

	public boolean isVolco() {
		return volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco =  volco;
	}
	
	public static int cantidadCamionetas() {
		return listado.size();
	}
}
