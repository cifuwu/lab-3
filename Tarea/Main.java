package Tarea;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {		
		
		Scanner entrada = new Scanner(System.in);
		String palabra;

		ArrayList<String> sopaDeLetras = new ArrayList<String>();
		Datos archivo = new Datos("C:\\Users\\pavez\\Desktop\\TareasSo\\Tarea 3\\T3\\Tarea\\hola.txt");
		archivo.Leer();
		sopaDeLetras = archivo.getSopaDeLetras();

		for (int i=0; i< sopaDeLetras.size(); i++){
			System.out.println(sopaDeLetras.get(i));
		}

		//Se pide la palabra por consola
		System.out.print("Ingrese la plabra a buscar: ");
		palabra = entrada.nextLine();

	
	}

}
