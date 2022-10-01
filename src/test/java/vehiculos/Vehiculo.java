package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private float precio;
	private float peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	private static ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		setCantidadVehiculos(getCantidadVehiculos() + 1);
		this.setPlaca(placa);
		this.setPuertas(puertas);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setTraccion(traccion);
		this.setFabricante(fabricante);
		listado.add(this);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.cantidadAutomoviles()+"\nCamionetas: "+Camioneta.cantidadCamionetas()+"\nCamiones: "+Camion.cantidadCamiones();
	}
	
	public static ArrayList<Vehiculo> vehiculos() {
		return listado;
	}
	
	public boolean isFabricante(Fabricante fabricante) {
		if(this.fabricante.equals(fabricante)) {
			return true;
		}else {
			return false;
		}

	}
}
