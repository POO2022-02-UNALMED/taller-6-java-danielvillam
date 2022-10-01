package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
		listado.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	private static int mayor(int[] valores) {
		int may = valores[0];
		int pos = 0;
		for(int i=1; i<valores.length; i++) {
			if(valores[i]>may) {
				may=valores[i];
				pos = i;
			}
		}
		return pos;
	}
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Vehiculo> vehiculos = Vehiculo.vehiculos();
		int[] valores = new int[listado.size()];
		for(int i=0; i<listado.size(); i++) {
			for(int j=0; j<vehiculos.size();j++) {
				if(vehiculos.get(j).isFabricante(listado.get(i))) {
					valores[i]+=1;
				}	
			}
		}
		return listado.get(mayor(valores));
	}
	
}
