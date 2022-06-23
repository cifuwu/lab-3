package Tarea;

public class Recursive {
    int x;
    public Recursive(int x){
        this.x = x;
    }

    public void dividir(char[][] matriz, String palabra){
        if(matriz.length > palabra.length()){

            dividir(matriz,palabra);
        }

        return;
    }
}
