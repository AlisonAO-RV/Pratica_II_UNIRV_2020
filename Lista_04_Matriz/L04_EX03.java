/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 04 - Matriz
* EXERCICIO 03
*/

import java.util.Random;

public class L04_EX03 {

    public static void main(String[] args) {

        Random rand = new Random();

        int matrizA[][] = new int[10][10];
        int matrizB[][] = new int[10][10];

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

                if (matrizA[i][j] % 2 == 0) {
                    matrizB[i][j] = 0;
                } else {
                    matrizB[i][j] = 1;
                }

                System.out.printf("|  %d  ", matrizB[i][j]);

            }

            System.out.printf("|%n");
        }
    }

}
