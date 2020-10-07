/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 05 - Matriz
* EXERCICIO 03
*/

import java.util.Random;

public class L05_EX03 {

    public static void main(String[] args) {

        Random rand = new Random();

        String corA = "\033[0;33m";
        String corB = "\033[0m";

        int matrizA[][] = new int[15][5];
        int matrizAux[][] = new int[2][75];
        int contAux = 1;
        boolean verifica = true;
        int repet = 0;

        System.out.printf("%n%n| MATRIZ A%n%n");

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                matrizA[i][j] = rand.nextInt(10) + 1;
                System.out.printf("| %2d ", matrizA[i][j]);
            }

            System.out.printf("|%n");
        }

        System.out.printf("%n%n| RESPOSTA %n%n");

        matrizAux[0][0] = matrizA[0][0];

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                for (int k = 0; k < contAux; k++) {

                    if (matrizAux[0][k] == matrizA[i][j]) {

                        verifica = false;
                    }
                }

                if (verifica == true) {

                    matrizAux[0][contAux] = matrizA[i][j];
                    contAux++;
                }

                verifica = true;
            }
        }

        for (int i = 0; i < contAux; i++) {

            for (int j = 0; j < matrizA.length; j++) {

                for (int k = 0; k < matrizA[j].length; k++) {

                    if (matrizAux[0][i] == matrizA[j][k]) {

                        repet++;
                    }
                }

                matrizAux[1][i] = repet;

                // numero: 0 [1][3][7][10][12] 
                // quant:  1 [5][4][3][ 7][10]
                
            }
            repet = 0;
        }

        System.out.printf("| Numero | Quant  |%n");

        for (int i = 0; i < contAux; i++) {

            for (int j = 0; j < matrizAux.length; j++) {

                System.out.printf("|   %s%2d%s   ", corA, matrizAux[j][i], corB);
            }

            System.out.printf("|%n");
        }

    }

}
