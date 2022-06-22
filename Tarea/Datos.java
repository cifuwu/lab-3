package Tarea;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Datos {
    
    private ArrayList<String> sopaDeLetras;
    private String nombreArchivo;

    public Datos(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
        this.sopaDeLetras  = new ArrayList<String>();
    }

	public void Leer(){
        
		try {
            File archivo = new File(nombreArchivo);
            Scanner obj = new Scanner(archivo);
            String aux;
            //Recorremos linea a linea y agregamos al arreglo
            //sopaDeLetras = [linea1, linea2, linea3...]
		    while(obj.hasNextLine()){
		    	aux = obj.nextLine();
		    	sopaDeLetras.add(aux);
		    }
        
		    obj.close();

        } catch (Exception e) {
            System.out.println("Ocurrio un error con el archivo "+e);
        }       
    }

    //Retorna la SopaDeLetras del archivo
    public ArrayList<String> getSopaDeLetras(){
        return sopaDeLetras;
    }

}
