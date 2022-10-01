package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> listado = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.setNombre(nombre);
		listado.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public static Pais paisMasVendedor() {
		ArrayList<Vehiculo> vehiculos = Vehiculo.vehiculos();
		int[] valores = new int[listado.size()];
		for(int i=0; i<listado.size(); i++) {
			for(int j=0; j<vehiculos.size();j++) {
				if(vehiculos.get(j).isPais(listado.get(i))) {
					valores[i]+=1;
				}	
			}
		}
		return listado.get(mayor(valores));
	}
}
