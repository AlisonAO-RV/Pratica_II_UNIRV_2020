/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 05 - Matriz
* EXERCICIO 05
*/

import java.util.Random;

public class L05_EX05 {

    public static void main(String[] args) {

        Random rand = new Random();

        String corA = "\033[0;33m";
        String corB = "\033[0m";

        int vetorA[] = new int[18];
        int matrizA[][] = new int[3][6];
        int contador = 0;

        System.out.printf("%n%n| VETOR - 18%n");

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = rand.nextInt(9) + 1;
            System.out.printf("| %d ", vetorA[i]);
        }

        System.out.printf("|%n%n");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                matrizA[i][j] = vetorA[contador];
                contador++;
            }
        }
        
        System.out.printf("| MATRIZ - 3X6 %n");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                System.out.printf("|%s %d %s", corA, matrizA[i][j], corB);
            }

            System.out.printf("|%n");

        }

        System.out.printf("%n");

    }

}
