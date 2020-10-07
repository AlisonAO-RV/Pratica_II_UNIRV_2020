/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 04 - Matriz
* EXERCICIO 05
*/

import java.util.Random;

public class L04_EX05 {

    public static void main(String[] args) {

        Random rand = new Random();

        int matrizA[][] = new int[10][10];
        int vetorR[] = new int[10];
        int soma = 0;

        System.out.printf("%nMatriz A%n");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                matrizA[i][j] = rand.nextInt(30) + 1;
                System.out.printf("| %3d ", matrizA[i][j]);

            }

            System.out.printf("|%n");
        }

        System.out.printf("%nVetor Resultado%n");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                soma += matrizA[j][i];

            }

            vetorR[i] = soma;
            System.out.printf("| %3d ", vetorR[i]);
            soma = 0;
        }

        System.out.printf("|%n%n");

    }

}
