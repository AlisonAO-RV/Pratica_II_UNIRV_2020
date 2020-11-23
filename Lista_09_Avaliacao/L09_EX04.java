/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 04
*/

import java.util.Random;

public class L09_EX04 {

    public static void main(String[] args) {

        Random rand = new Random();

        int MatrizA[][] = new int[6][4];
        int ContMaior30 = 0;
        int ContIgual30 = 0;

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                MatrizA[i][j] = rand.nextInt(4) + 28;
            }
        }

        System.out.printf("\n\33[0;33m| MATRIZ ORIGINAL\33[0m\n");
        for (int[] MatrizL : MatrizA) {
            for (int MatrizC : MatrizL) {
                System.out.printf("| %3d ", MatrizC);
                if (MatrizC > 30) {
                    ContMaior30++;
                }
                if (MatrizC == 30) {
                    ContIgual30++;
                }
            }
            System.out.printf("|\n");
        }

        System.out.printf("\n\33[0;33m| QUANTIDADE MAIOR QUE 30: %d\33[0m\n", ContMaior30);

        for (int[] MatrizL : MatrizA) {
            for (int MatrizC : MatrizL) {
                if (MatrizC > 30) {
                    System.out.printf("| \33[0;33m%3d\33[0m ", 0);
                } else {
                    System.out.printf("| %3d ", MatrizC);
                }
            }
            System.out.printf("|\n");
        }

        System.out.printf("\n\33[0;33m| QUANTIDADE IGUAL A 30: %d\33[0m\n", ContIgual30);

        for (int[] MatrizL : MatrizA) {
            for (int MatrizC : MatrizL) {
                if (MatrizC == 30) {
                    System.out.printf("| \33[0;33m%3d\33[0m ", 0);
                } else {
                    System.out.printf("| %3d ", MatrizC);
                }
            }
            System.out.printf("|\n");
        }

    }

}
