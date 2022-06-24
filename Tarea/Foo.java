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
                 palabra4 ]
    el cuadrante tiene el mismo ancho que la palabra, por lo que la palabra siempre se encontrará
    en una linea de este, puede estar de derecha -> izquierda o de forma invertida.
                 */
    private ArrayList<String> cuadrante = new ArrayList<String>();
    private String palabra;
    private int pos;//Retorna la posicion del caudrante

    @Override
    public void run(){
        String line;
        String palabra_invert = Reverse(palabra);
        //Se recorre el cuadrante
        for (int i=0; i < cuadrante.size(); i++){
            //En aux guardamos las lineas del cuadrante
            line = cuadrante.get(i).toLowerCase();
            //En el caso de que encuentra la palbra de forma horizontal a la derecha o horizontal invertida (izq -> der)
            if (line.contains(palabra) || line.contains(palabra_invert) ){
                pos =   cuadrante.indexOf(palabra); // retorna la posicion dentro del cuadrante

                //falta saber el numero del cuadrante
            }
        }
    }

    //Se pide el cuadrante donde la hebra buscará la palabra
    public void setCuadrante(ArrayList<String> cuadrante){
        this.cuadrante = cuadrante;
    }

    //Seteamos la palabra a buscar
    public void setPalabra(String palabra){
        this.palabra = palabra.toLowerCase();
    }
    
    //Retorna la posicion donde encontró la palabra dentro del cuadrante
    public int getPos(){
        return pos;
    }

    //Nos retornará la palabra de forma invertida
    private String Reverse(String palabra){
        String palabra_invert = palabra;
        StringBuilder strb = new StringBuilder(palabra_invert);
        palabra_invert = strb.reverse().toString();
        return palabra_invert;
    }
 }