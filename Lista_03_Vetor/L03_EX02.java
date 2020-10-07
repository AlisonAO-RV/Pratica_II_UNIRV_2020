/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 02
*/

import java.util.Scanner;

public class L03_EX02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorN[] = new int[10];
        int vetorD[] = new int[5];
        int contador = 0;

        System.out.println("");

        for (int i = 0; i < vetorN.length; i++) {
            System.out.printf("Digite um Numero Inteiro - %d/10: ", (i + 1));
            vetorN[i] = sc.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < vetorD.length; i++) {
            System.out.printf("Digite um Numero Inteiro - %d/5: ", (i + 1));
            vetorD[i] = sc.nextInt();
        }

        sc.close();
        System.out.println("");

        for (int i = 0; i < vetorN.length; i++) {

            System.out.printf("|- Numero %d%n", vetorN[i]);

            for (int j = 0; j < vetorD.length; j++) {

                if (vetorN[i] % vetorD[j] == 0) {
                    System.out.printf("|-- Divisível por %d na posição %d%n", vetorD[j], (j + 1));
                    contador++;
                }

            }

            if (contador == 0) {
                System.out.printf("|-- Não possue divisores no segundo vetor%n");
            }

            contador = 0;

            System.out.println("");

        }
        
    }

}
