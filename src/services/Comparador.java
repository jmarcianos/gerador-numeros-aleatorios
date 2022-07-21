package services;

public class Comparador {
    public static int comparar(int[] numerosSorteados, int temp, int contador){
        int contRepitidos= 0;
        for(int i = 0; i<= contador; i++){
            if(temp==numerosSorteados[i]){
                contRepitidos++;
            }
        }
        if(contRepitidos == 0){
            return 0;
        }else{
            return 1;
        }
    }
}
