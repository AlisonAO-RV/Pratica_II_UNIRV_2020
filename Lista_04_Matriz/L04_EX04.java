/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 04 - Matriz
* EXERCICIO 04
*/

import java.util.Random;

public class L04_EX04 {

    public static void main(String[] args) {

        Random rand = new Random();

        int matrizA[][] = new int[5][10];
        int matrizB[][] = new int[10][5];
        int matrizC[][] = new int[5][5];
        int soma = 0;

        System.out.println("");
        System.out.println("Matriz A");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                matrizA[i][j] = rand.nextInt(30) + 1;
                System.out.printf("| %3d ", matrizA[i][j]);

            }

            System.out.printf("|%n");
        }

        System.out.println("");
        System.out.println("Matriz B");

        for (int i = 0; i < matrizB.length; i++) {

            for (int j = 0; j < matrizB[i].length; j++) {

                matrizB[i][j] = rand.nextInt(30) + 1;
                System.out.printf("| %3d ", matrizB[i][j]);

            }

            System.out.printf("|%n");
        }

        System.out.println("");
        System.out.println("Matriz C");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizB[i].length; j++) {

                for (int k = 0; k < matrizA[i].length; k++) {

                    soma += matrizA[i][k] * matrizB[k][j];

                }

                matrizC[i][j] = soma;
                System.out.printf("| %6d ", matrizC[i][j]);
                soma = 0;

            }

            System.out.printf("|%n");

        }
    }

}
