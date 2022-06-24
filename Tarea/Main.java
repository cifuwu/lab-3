package Tarea;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import javax.swing.JSpinner.NumberEditor;

public class Main {
	public static void main(String[] args) throws Exception {		
		
		Scanner entrada = new Scanner(System.in);
		String palabra;
		int size_palabra, size_sopaDeLetras;
		

		ArrayList<String> sopaDeLetras = new ArrayList<String>();
		Datos archivo = new Datos("sopa.txt");
		archivo.Leer();
		/*sopaDeLetras = [	linea1,
							linea 2
							lnea 3,
							...
							linea n] */
		sopaDeLetras = archivo.getSopaDeLetras();

		size_sopaDeLetras = sopaDeLetras.get(0).length();//ancho de la sopa de letras

		//sopa es una matriz de caracteres que componen a la sopa de letras
		char[][] sopa = new char[size_sopaDeLetras][size_sopaDeLetras];
		sopa = Convertir(sopaDeLetras, size_sopaDeLetras);
		
		/*for(int i=0; i<sopa.length; i++){
			for (int j=0; j<size_sopaDeLetras;j++){
				System.out.print(sopa[i][j]);
			}
			System.out.println("");
		}*/

		//Se pide la palabra por consola
		System.out.print("Ingrese la plabra a buscar: ");
		//palabra = palabra ingresada por consola que debemos buscar
		palabra = entrada.nextLine();
		entrada.close();

		size_palabra = palabra.length();//largo de la palabra a buscar

	
	}




	//Convierte a un arreglo de char
	public static char[][] Convertir(ArrayList<String> sopaDeLetras, int size_sopaDeLetras){
		char[][] sopa = new char[size_sopaDeLetras][size_sopaDeLetras];
		char[] aux;

		for (int i=0; i < size_sopaDeLetras; i++){
			aux = sopaDeLetras.get(i).toCharArray();
			for(int j=0; j < size_sopaDeLetras; j++){
				sopa[i][j] = aux[j];
			}
		}
		return sopa;
	}

}
