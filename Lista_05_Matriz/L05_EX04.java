/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 05 - Matriz
* EXERCICIO 04
*/

import java.util.Random;

public class L05_EX04 {

    public static void main(String[] args) {

        Random rand = new Random();

        int matrizA[][] = new int[8][8];
        boolean verifica = true;

        System.out.printf("%n%n");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                matrizA[i][j] = rand.nextInt(10) + 1; // Randon
                // matrizA[i][j] = (i+1) * (j + 1); // Simetrico
                System.out.printf("| %2d ", matrizA[i][j]);
            }

            System.out.printf("|%n");
        }

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                if (matrizA[i][j] != matrizA[j][i]) {

                    verifica = false;
                }
            }
        }

        System.out.printf("%n");

        if (verifica == true) {

            System.out.printf("Matriz SIMETRICA%n");
            
        } else {

            System.out.printf("Matriz NÃO SIMETRICA%n");
        }

    }

}
