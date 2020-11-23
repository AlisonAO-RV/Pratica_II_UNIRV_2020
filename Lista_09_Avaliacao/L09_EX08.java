/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 08
*/

import java.util.Random;

public class L09_EX08 {

    public static void main(String[] args) {

        Random rand = new Random();

        double MatrizA[][][] = new double[3][8][4];
        double MediaAluno = 0;
        double MediaTurma = 0;

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                for (int k = 0; k < MatrizA[i][j].length; k++) {
                    MatrizA[i][j][k] = rand.nextFloat() * 10;
                }
            }
        }

        for (int i = 0; i < MatrizA.length; i++) {
            System.out.printf("\n\33[0;33m*** Turma: %d\33[0m\n", i + 1);

            for (int j = 0; j < MatrizA[i].length; j++) {
                System.out.printf("\33[0;36mAluno:%2d -> \33[0m", j + 1);

                for (int k = 0; k < MatrizA[i][j].length; k++) {
                    System.out.printf("| %5.2f ", MatrizA[i][j][k]);
                    MediaAluno += MatrizA[i][j][k];
                }

                if ((MediaAluno / MatrizA[i][j].length) < 6.0) {
                    System.out.printf("|\33[0;31m Média: %5.2f \33[0m", (MediaAluno / (double) 4));
                } else {
                    System.out.printf("|\33[0;32m Média: %5.2f \33[0m", (MediaAluno / (double) 4));
                }

                System.out.printf("|\n");
                MediaTurma += MediaAluno / (double) 4;
                MediaAluno = 0;
            }

            System.out.printf("\33[0;33m %38s Média Turma: %5.2f\33[0m |\n", " ", (MediaTurma / (double) 8));
            MediaTurma = 0;
        }

        System.out.printf("\n\n\33[0;33m*** Média de Cada Turma\33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {
            System.out.printf("\33[0;36m    Turma %d Média: \33[0m", i + 1);

            for (int j = 0; j < MatrizA[i].length; j++) {
                for (int k = 0; k < MatrizA[i][j].length; k++) {
                    MediaAluno += MatrizA[i][j][k];
                }
                MediaTurma += MediaAluno / (double) 4;
                MediaAluno = 0;
            }
            System.out.printf("\33[0;33m%5.2f\33[0m\n", (MediaTurma / (double) 8));
            MediaTurma = 0;
        }
        System.out.printf("\n\n\n");
    }

}
