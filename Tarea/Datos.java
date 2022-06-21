package Tarea;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Datos {
    
    private ArrayList<String> sopaDeLetras = new ArrayList<String>();
    private String nombreArchivo;

    public Datos(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

	public void Leer(){
        
		try {
            File archivo = new File(nombreArchivo);
            Scanner obj = new Scanner(archivo);
            String aux;
		    while(obj.hasNextLine()){
		    	aux = obj.nextLine();
		    	sopaDeLetras.add(aux);
		    }
        
		    obj.close();

        } catch (Exception e) {
            System.out.println("Ocurrio un error con el archivo "+e);
        }       
    }

    public ArrayList<String> getSopaDeLetras(){
        return sopaDeLetras;
    }

}
