/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 05
*/

import java.util.Random;

public class L09_EX05 {

    public static void main(String[] args) {
        
        Random rand = new Random();

        int MatrizA[][] = new int[10][10];
        int Aux[] = new int[10];

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                MatrizA[i][j] = rand.nextInt(50) + 1;
            }
        }

        System.out.printf("\n\33[0;33m| MATRIZ ORIGINAL\33[0m\n");
        for (int[] MatrizL : MatrizA) {
            for (int MatrizC : MatrizL) {
                System.out.printf("| %3d ", MatrizC);
            }
            System.out.printf("|\n");
        }

        for (int i = 0; i < Aux.length; i++) {
            Aux[i] = MatrizA[2][i];
        }

        for (int i = 0; i < Aux.length; i++) {
            MatrizA[1][i] = MatrizA[7][i];
            MatrizA[7][i] = Aux[i];
        }

        System.out.printf("\n\33[0;33m| Linhas 2 x 8\33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                if (i == 1 || i == 7) {
                    System.out.printf("| \33[0;33m%3d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| %3d ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }

        for (int i = 0; i < Aux.length; i++) {
            Aux[i] = MatrizA[i][3];
        }

        for (int i = 0; i < Aux.length; i++) {
            MatrizA[i][3] = MatrizA[i][9];
            MatrizA[i][9] = Aux[i];
        }

        System.out.printf("\n\33[0;33m| Coluna 4 x 10\33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                if (j == 3 || j == 9) {
                    System.out.printf("| \33[0;33m%3d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| %3d ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                if (i == j) {
                    Aux[i] = MatrizA[i][j];
                }
            }
        }
        
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                if (i ==j ) {
                    MatrizA[i][j] = MatrizA[i][9 - j];
                } else if (i == (9 - j)) {
                    MatrizA[i][9 - i] = Aux[i];
                }
            }
        }

        System.out.printf("\n\33[0;33m| Diagonais\33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                if (i == j || i == (9 - j)) {
                    System.out.printf("| \33[0;33m%3d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| %3d ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }


        for (int i = 0; i < Aux.length; i++) {
            Aux[i] = MatrizA[i][9];
        }

        for (int i = 0; i < Aux.length; i++) {
            MatrizA[i][9] = MatrizA[4][i];
            MatrizA[4][i] = Aux[i];
        }

        System.out.printf("\n\33[0;33m| Linha 5 x Coluna 10\33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                if (i == 4 || j == 9) {
                    System.out.printf("| \33[0;33m%3d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| %3d ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }

    }

}