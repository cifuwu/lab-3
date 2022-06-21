package Tarea;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {		
		
		ArrayList<String> sopaDeLetras = new ArrayList<String>();
		Datos archivo = new Datos("DireccionDeArchivo");
		archivo.Leer();
		sopaDeLetras = archivo.getSopaDeLetras();

		for (int i=0; i< sopaDeLetras.size(); i++){
			System.out.println(sopaDeLetras.get(i));
		}

	}

}
