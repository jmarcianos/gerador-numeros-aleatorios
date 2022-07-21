package services;

import java.util.Arrays;
import java.util.Random;

public class Sorteador {
    public static void sortear(int numInicial, int numFinal, int quantidadeNumSortear){
        Random random = new Random();
        int contador = 0;
        int comparador;
        int temp;
        int[] numerosSorteados = new int[quantidadeNumSortear];


        while(contador<numerosSorteados.length){
            temp = random.nextInt(numInicial,numFinal);
            comparador = Comparador.comparar(numerosSorteados,temp,contador);
            if(comparador == 0){
                numerosSorteados[contador] = temp;
                contador++;
            }
        }
        System.out.println("Números sorteados:");
        Arrays.sort(numerosSorteados);
        for (int i = 0; i < numerosSorteados.length;i++){
            System.out.print(numerosSorteados[i]+" ");
        }
        System.out.println();
    }
}
