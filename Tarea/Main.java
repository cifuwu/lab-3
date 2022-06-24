package Tarea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws InterruptedException{
        File file = new File("matriz.txt");
        try{
            Scanner xd = new Scanner(file);
            String linea = xd.nextLine();

            //acá creamos la matriz iterando sobre lo leido en el archivo.
            char matriz[][] = new char[linea.length()][linea.length()];
            char[] aux = linea.toCharArray();
            int a = 0;

            for (int b = 0; b<linea.length(); b++ ){
                matriz[a][b] = aux[b];
            }
            a += 1;
            while(xd.hasNextLine()){
                linea = xd.nextLine();
                aux = linea.toCharArray();

                for (int b = 0; b<linea.length(); b++ ){
                    matriz[a][b] = aux[b];
                }
                a += 1;
            }
            xd.close();

            //inicio de la interacción con el usuario 
            System.out.println("Ingresa una palabra:");
            String palabra = System.console().readLine();


            Long tiempo_inicial = System.nanoTime(); //tiempo inicial
            

            //creamos el objeto que resuelve la sopa
            Resolver hilo = new Resolver(matriz, 0, 0, palabra, matriz.length);
            hilo.start();

            //espera a que termine el hilo
            try{  
                hilo.join();  
               }
               catch(Exception e){
                   System.out.println(e);
                   } 

            //toma el tiempo final
            Long tiempo_final = System.nanoTime();
            long tiempo_total = tiempo_final-tiempo_inicial;

            

            System.out.println("El tiempo de ejecución con hebras fue de: "+tiempo_total+" nanosegundos");

        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
