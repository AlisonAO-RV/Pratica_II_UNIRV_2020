/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 07
*/

import java.util.Scanner;

public class L09_EX07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int MatrizA[][] = new int[4][4];

        System.out.printf("\n\33[0;33m*** Digite Números Multiplos de 5\33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {
            System.out.printf("\33[0;33m-->: \33[0m");
            MatrizA[i][i] = sc.nextInt();
        }

        System.out.printf("\n\33[0;32m*** Digite Números Positivos Pares\33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = i + 1; j < MatrizA[i].length; j++) {
                System.out.printf("\33[0;32m-->: \33[0m");
                MatrizA[i][j] = sc.nextInt();
            }
        }

        System.out.printf("\n\33[0;31m*** Digite Números Negativos\33[0m\n");
        for (int i = 1; i < MatrizA.length; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.printf("\33[0;31m-->: \33[0m");
                MatrizA[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.printf("\n\33[0;33m*** Resultados\33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                if (i == j) {
                    System.out.printf("| \33[0;33m%3d\33[0m ", MatrizA[i][j]);
                } else if (i < j) {
                    System.out.printf("| \33[0;32m%3d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| \33[0;31m%3d\33[0m ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }
    }

}
