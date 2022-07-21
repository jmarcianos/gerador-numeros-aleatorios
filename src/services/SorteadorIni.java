package services;

import java.util.Scanner;

public class SorteadorIni {
    public static void Ini(){
        Scanner scanner = new Scanner(System.in);
        int numInicial;
        int numFinal;
        int quantidadeNumSortear;
        System.out.println("Escolha em qual número deve se iniciar o sorteio:");
        numInicial = scanner.nextInt();
        if (numInicial < 1) {
            System.out.println("número inicial inválido, não pode ser menor que 1 ");
            return;
        }
        System.out.println("Até qual número deve ir o sorteio?");
        numFinal = scanner.nextInt();
        if (numFinal <= numInicial) {
            System.out.println("Sorteio inválido, número final menor que o inicial");
            return;
        }
        System.out.println("Quantos números devem ser sorteados?");
        quantidadeNumSortear = scanner.nextInt();
        if ((numFinal - (numInicial - 1)) < quantidadeNumSortear) {
            System.out.println("Sorteio inválido, quantidade de números menor que o intervalo");
            return;
        }
        Sorteador.sortear(numInicial,numFinal, quantidadeNumSortear);
    }
}
