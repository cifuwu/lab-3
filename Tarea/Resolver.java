package Tarea;

public class Resolver extends Thread{
    char[][] matriz; 
    int len_matriz;
    int x;
    int y;
    String palabra;

    //constructor del objeto Resolver.
    //recibe: la matriz, la posición en x y en y (que parten en 0), la palabra a encontrar y el largo de la matriz
    public Resolver(char[][] matriz, int x, int y, String palabra, int len_matriz){
        this.matriz = matriz;
        this.x = x;
        this.y = y;
        this.palabra = palabra;
        this.len_matriz = len_matriz;
    }

    //ciclo al que se le crean las hebras.
    @Override
    public void run(){

        //caso base, cuando el largo de la matriz es igual al largo de la palabra que se ingresó como parámetro
        if (len_matriz == palabra.length()){

            String aux = "";
            for (int i = x; i < x + palabra.length(); i++){

                for (int j = y; j < y + palabra.length(); j++){
                    aux += matriz[i][j];}

                if(aux.equals(palabra)){
                    System.out.println("La palabra se encontró en la posición [" + i + "][" + y + "]");
                    break;}
                aux = "";
            }
        }

        // si no se cumple el caso base, se debe dividir la matriz.
        // si el largo de la matriz es par, se divide en 4, si es impar, se divide en 9 
        else
        {
            if((len_matriz/palabra.length()) % 2 == 0){

                //creación de 4 hilos, dividiendo la matriz en 4.
                Resolver hilo1 = new Resolver(matriz, x, y, palabra, (len_matriz/2));
                Resolver hilo2 = new Resolver(matriz, x, y + (len_matriz/2), palabra, (len_matriz/2));
                Resolver hilo3 = new Resolver(matriz, x + (len_matriz/2), y, palabra, (len_matriz/2));
                Resolver hilo4 = new Resolver(matriz, x + (len_matriz/2), y + (len_matriz/2), palabra, (len_matriz/2));

                hilo1.start();
                hilo2.start();
                hilo3.start();
                hilo4.start();
            }
            else{

                //creación de 9 hilos, dividiendo la matriz en 9.
                Resolver hilo1 = new Resolver(matriz, x, y, palabra, (len_matriz/3));
                Resolver hilo2 = new Resolver(matriz, x, y + (len_matriz/3), palabra, (len_matriz/3));
                Resolver hilo3 = new Resolver(matriz, x, y + 2*(len_matriz/3), palabra, (len_matriz/3));
                Resolver hilo4 = new Resolver(matriz, x + (len_matriz/3), y, palabra, (len_matriz/3));
                Resolver hilo5 = new Resolver(matriz, x + (len_matriz/3), y + (len_matriz/3), palabra, (len_matriz/3));
                Resolver hilo6 = new Resolver(matriz, x + (len_matriz/3), y + 2*(len_matriz/3), palabra, (len_matriz/3));
                Resolver hilo7 = new Resolver(matriz, x + 2*(len_matriz/3), y, palabra, (len_matriz/3));
                Resolver hilo8 = new Resolver(matriz, x + 2*(len_matriz/3), y + (len_matriz/3), palabra, (len_matriz/3));
                Resolver hilo9 = new Resolver(matriz, x + 2*(len_matriz/3), y + 2*(len_matriz/3), palabra, (len_matriz/3));

                hilo1.start();
                hilo2.start();
                hilo3.start();
                hilo4.start();
                hilo5.start();
                hilo6.start();
                hilo7.start();
                hilo8.start();
                hilo9.start();
            }
            
        }
    }
}
