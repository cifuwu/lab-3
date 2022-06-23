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
		/*sopaDeLetras = [	linea1,
							linea 2
							lnea 3,
							...
							linea n] */
		sopaDeLetras = archivo.getSopaDeLetras();

		for (int i=0; i< sopaDeLetras.size(); i++){
			System.out.println(sopaDeLetras.get(i));
		}

		//Se pide la palabra por consola
		System.out.print("Ingrese la plabra a buscar: ");
		//palabra = palabra ingresada por consola que debemos buscar
		palabra = entrada.nextLine();
		entrada.close();

		size_palabra = palabra.length();//largo de la palbra a buscar
		size_sopaDeLetras = sopaDeLetras.get(0).length();//ancho de la sopa de letras

		//tamaño sopa de letras = M x M(cuadrada)
		//Tamaño de palabra = n
		// numeroDeCuadrantes = (M X M) / (n x n)
		numeroDeCuadrantes = cantidadDeCuadrantes(size_palabra, size_sopaDeLetras);

		//Se deben crear los cuadrantes a partir de la sopaDeLetras para cada hebra
		int inicio, fin;
		for (int i=0;  i < numeroDeCuadrantes; i++){
			sopaDeLetras.
		}

	
	}

	//Funcion que retorna la cantidad de cuadrantes que se revisarán
	public static int cantidadDeCuadrantes(int size_palabra, int size_sopaDeLetras){
		int mul1 = size_palabra * size_palabra;
		int mult2 = size_sopaDeLetras * size_sopaDeLetras;
		int cantidadDeCuadrantes = mult2/mul1;
		return cantidadDeCuadrantes;
	}

}
