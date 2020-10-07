/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 04 - Matriz
* EXERCICIO 01
*/

import java.util.Random;

public class L04_EX01 {

    public static void main(String[] args) {

        Random rand = new Random();

        int matriz[][];
        int ordenN = 0;

        ordenN = rand.nextInt(30) + 1;
        System.out.printf("%nValor de n: %d%n", ordenN);

        matriz = new int[ordenN][ordenN];

        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.printf("| %d ", matriz[i][j]);

            }

            System.out.println("|");

        }
    }
}