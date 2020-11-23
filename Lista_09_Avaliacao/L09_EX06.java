/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 06
*/

import java.util.Random;

public class L09_EX06 {

    public static void main(String[] args) {

        Random rand = new Random();

        int MatrizA[][] = new int[4][4];
        int somaLinha[] = new int[4];
        int somaColuna[] = new int[4];
        int somaDiagonal[] = new int[2];
        int Aux = 0;
        boolean Magico = true;

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
                somaLinha[i] += MatrizA[i][j];
                somaColuna[i] += MatrizA[j][i];
                if (i == j) {
                    somaDiagonal[0] += MatrizA[i][j];
                }
                if (i == ((MatrizA[i].length - 1) - j)) {
                    somaDiagonal[1] += MatrizA[i][j];
                }
            }
        }
        System.out.printf("\n\33[0;33m| Soma das Linha\33[0m\n");
        for (int i : somaLinha) {
            System.out.printf("| %d ", i);
        }
        System.out.printf("|\n");

        System.out.printf("\n\33[0;33m| Soma das Colunas\33[0m\n");
        for (int i : somaColuna) {
            System.out.printf("| %d ", i);
        }
        System.out.printf("|\n");

        System.out.printf("\n\33[0;33m| Soma das Diagonais\33[0m\n");
        for (int i : somaDiagonal) {
            System.out.printf("| %d ", i);
        }
        System.out.printf("|\n");

        Aux = somaLinha[0];
        for (int i = 0; i < somaDiagonal.length; i++) {
            if (somaLinha[i] != Aux) {
                Magico = false;
            }

            if (somaColuna[i] != Aux) {
                Magico = false;
            }

            if (somaDiagonal[i] != Aux) {
                Magico = false;
            }
        }

        if (Magico) {
            System.out.println("\n\33[0;32m*** É Magico ***\33[0m\n\n");
        } else {
            System.out.println("\n\33[0;31m*** Não é Magico ***\33[0m\n\n");
        }

    }

}
