/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 04 - Matriz
* EXERCICIO 02
*/

import java.util.Random;

public class L04_EX02 {

    public static void main(String[] args) {

        Random rand = new Random();

        int matrizN3[][] = new int[3][3];
        int primeiraLinha = 0;
        int terceiraColuna = 0;
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;
        int somaTotal = 0;

        for (int i = 0; i < matrizN3.length; i++) {

            for (int j = 0; j < matrizN3[i].length; j++) {

                matrizN3[i][j] = rand.nextInt(30) + 1;

            }

        }

        System.out.printf("%n%n");

        for (int i = 0; i < matrizN3.length; i++) {
            for (int j = 0; j < matrizN3[i].length; j++) {

                System.out.printf("| %2d ", matrizN3[i][j]);

                if (i == 0)
                    primeiraLinha += matrizN3[i][j];

                if (j == 2)
                    terceiraColuna += matrizN3[i][j];

                if (j == i)
                    diagonalPrincipal += matrizN3[i][j];

                if ((2 - i) == j)
                    diagonalSecundaria += matrizN3[i][j];

                somaTotal += matrizN3[i][j];
            }

            System.out.printf("|%n");

        }

        System.out.printf("%nSoma da Primeira Linha: %d", primeiraLinha);
        System.out.printf("%nSoma da Terceira Coluna: %d", terceiraColuna);
        System.out.printf("%nSoma da Diagonal Principal: %d", diagonalPrincipal);
        System.out.printf("%nSoma da Diagonal Secundaria: %d", diagonalSecundaria);
        System.out.printf("%nSoma de Todos os Elementos: %d", somaTotal);
        System.out.printf("%n%n");
    }

}
