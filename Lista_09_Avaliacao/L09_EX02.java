/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 02
*/

import java.util.Random;

public class L09_EX02 {

    public static void main(String[] args) {

        Random rand = new Random();

        int Matriz[][] = new int[10][20];
        int Vetor[] = new int[10];
        int Resultado[][] = new int[10][20];
        int Acumulador = 0;

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = rand.nextInt(8) + 1;
                Acumulador += Matriz[i][j];
            }
            Vetor[i] = Acumulador;
            Acumulador = 0;
            for (int j = 0; j < Resultado[i].length; j++) {
                Resultado[i][j] = Matriz[i][j] * Vetor[i];
            }
        }

        System.out.printf("\n\33[0;33mMATRIZ\33[0m\n");
        for (int[] MatrizL : Matriz) {
            for (int MatrizC : MatrizL) {
                System.out.printf("| %3d ", MatrizC);
            }
            System.out.printf("|\n");
        }

        System.out.printf("\n\33[0;33mVETOR\33[0m\n");
        for (int VetorC : Vetor) {
            System.out.printf("| %3d ", VetorC);
        }
        System.out.printf("|\n");

        System.out.printf("\n\33[0;33mRESULTADO\33[0m\n");
        for (int[] ResultadoL : Resultado) {
            for (int ResultadoC : ResultadoL) {
                System.out.printf("| %3d ", ResultadoC);
            }
            System.out.printf("|\n");
        }

    }

}
