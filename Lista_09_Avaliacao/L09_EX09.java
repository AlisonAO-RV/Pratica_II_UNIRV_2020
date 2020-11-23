/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 09
*/

import java.util.Random;

public class L09_EX09 {

    public static void main(String[] args) {

        Random rand = new Random();

        int MatrizA[][] = new int[2][4];
        int auxiliar = 0;

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                MatrizA[i][j] = rand.nextInt(50) + 1;
            }
        }

        System.out.printf("\n\33[0;33m|  MATRIZ ORIGINAL  |\33[0m\n");
        for (int[] MatrizL : MatrizA) {
            for (int MatrizC : MatrizL) {
                System.out.printf("| %2d ", MatrizC);
            }
            System.out.printf("|\n");
        }

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {

                for (int l = 0; l < MatrizA.length; l++) {
                    for (int c = 0; c < MatrizA[l].length; c++) {

                        if (MatrizA[i][j] < MatrizA[l][c]) {
                            auxiliar = MatrizA[i][j];
                            MatrizA[i][j] = MatrizA[l][c];
                            MatrizA[l][c] = auxiliar;
                        }
                    }
                }
            }
        }

        System.out.printf("\n\33[0;33m|     ORDENADO      |\33[0m\n");
        for (int[] MatrizL : MatrizA) {
            for (int MatrizC : MatrizL) {
                System.out.printf("| %2d ", MatrizC);
            }
            System.out.printf("|\n");
        }

        System.out.printf("\n\n");
    }

}
