package Tarea;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;

public class Main {
	public static void main(String[] args) throws Exception {		
		
		Scanner entrada = new Scanner(System.in);
		String palabra;
		int size_palabra, numeroDeCuadrantes, size_sopaDeLetras;

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
		entrada.close();

		//Calculamos el numero de caudrantes que nos dará el numero de hebras
		size_palabra = palabra.length();
		size_sopaDeLetras = sopaDeLetras.get(0).length();

		numeroDeCuadrantes = cantidadDeCuadrantes(size_palabra, size_sopaDeLetras);

		for (int i=0;  i < numeroDeCuadrantes; i++){
			
		}

	
	}

	public static int cantidadDeCuadrantes(int size_palabra, int size_sopaDeLetras){
		int mul1 = size_palabra * size_palabra;
		int mult2 = size_sopaDeLetras* size_sopaDeLetras;
		int cantidadDeCuadrantes = mult2/mul1;
		return cantidadDeCuadrantes;

	}

}
