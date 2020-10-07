/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 05 - Matriz
* EXERCICIO 02
*/

import java.util.Random;

public class L05_EX02 {

    public static void main(String[] args) {

        Random rand = new Random();

        float matrizA[][] = new float[4][7];
        float menorElemento = 0;
        int linhaDoMenor = 0;
        float maiorElemento = 0;
        int colunaDoMaior = 0;

        System.out.printf("%n%n| MATRIZ MINMAX%n%n");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                matrizA[i][j] = rand.nextFloat() * 20;
                System.out.printf("| %5.2f ", matrizA[i][j]);
            }

            System.out.printf("|%n");
        }

        menorElemento = matrizA[0][0];

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                if (matrizA[i][j] <= menorElemento) {

                    menorElemento = matrizA[i][j];
                    linhaDoMenor = i;
                }
            }
        }

        maiorElemento = matrizA[linhaDoMenor][0];

        for (int i = 0; i < matrizA[linhaDoMenor].length; i++) {

            if (matrizA[linhaDoMenor][i] >= maiorElemento) {

                maiorElemento = matrizA[linhaDoMenor][i];
                colunaDoMaior = i;
            }
        }

        System.out.printf("%n| Linha  %d - Valor: %.2f  - Menor Valor%n", linhaDoMenor + 1, menorElemento);
        System.out.printf("| Coluna %d - Valor: %.2f - Maior Valor%n%n%n", colunaDoMaior + 1, maiorElemento);

    }

}
