/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 02 - Vetor
* EXERCICIO 04
*/

import java.util.Scanner;

public class Lista_2_Ex_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int vetorC[] = new int[5];

        System.out.println("VALORES VETOR A \n");

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite o %dº valor do Vetor A: ", (i + 1));
            vetorA[i] = sc.nextInt();

        }

        System.out.println("\n VALORES VETOR B \n");

        for (int i = 0; i < vetorB.length; i++) {

            System.out.printf("Digite o %dº valor do Vetor B: ", (i + 1));
            vetorB[i] = sc.nextInt();

        }

        sc.close();

        System.out.println("\n SOMA VETOR A + B \n");

        for (int i = 0; i < vetorC.length; i++) {

            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.printf("A soma das posições %d de A + B é: %d %n", (i + 1), vetorC[i]);

        }
        
    }

}