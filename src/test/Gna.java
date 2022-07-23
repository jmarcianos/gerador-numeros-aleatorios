package test;

import services.SorteadorIni;

import java.util.Scanner;

public class Gna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char novoSorteio = 'y';

        System.out.println("Bem-vindo ao gerador de números aleatórios éééé");

        while (Character.toLowerCase(novoSorteio) == 'y') {
            System.out.println("\nDeseja realizar um novo sorteio (y) ou (n) para sair?");
            novoSorteio = scanner.next().charAt(0);

            if (Character.toLowerCase(novoSorteio) == 'y') {
                SorteadorIni.Ini();
            } else {
                System.out.println("Até mais");
                System.out.println("Programa encerrado");
            }
        }
    }
}
