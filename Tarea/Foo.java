package Tarea;

import java.util.ArrayList;

/*Esta clase devolverá el tiempo que se demora en trabajar. (EN NANOSEGUNDOS!)
Atributos: Value -> Valor a guardar
Metodo: getValue() -> Devuelve el valor de Value.
*/

public class Foo extends Thread {

    /*  cuadrante[palabra1,
                 palabra2,
                 palabra3,
                 palabra4 
                 ]
                 */
    private ArrayList<String> cuadrante = new ArrayList<String>();
    private String palabra;
    private int pos;

    @Override
    public void run(){
        String line;
        for (int i=0; i < cuadrante.size(); i++){
            //En aux guardamos las lineas del cuadrante
            line = cuadrante.get(i).toLowerCase();
            //En el caso de que encuentra la palbra de forma no inversa
            if (line.contains(palabra)){
                pos = line.indexOf(palabra);
            }else{

            }
        }
    }

    public void setCuadrante(ArrayList<String> cuadrante){
        this.cuadrante = cuadrante;
    }

    public void setPalabra(String palabra){
        this.palabra = palabra.toLowerCase();
    }

    public int getPos(){
        return pos;
    }
 }