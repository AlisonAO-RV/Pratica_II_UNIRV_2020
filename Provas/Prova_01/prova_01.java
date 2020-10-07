/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
*
* Prova 17/09/2020
*
* Faça um programa que preencha dois vetores, X e Y,
* com dez números inteiros cada e calcule o vetor resultante
* da interseção de X e Y (apenas os elementos que aparecem
* nos dois vetores, sem repetições).
*/

import java.util.Random;

public class prova_01 {

    public static void main(String[] args) {

        Random rand = new Random();

        int vetorX[] = new int[10];
        int vetorY[] = new int[10];
        int vetorR[] = new int[10];
        int contador = 0;
        int contadorIgualdade = 0;

        System.out.println("\nVetor X");

        for (int i = 0; i < vetorX.length; i++) {

            vetorX[i] = rand.nextInt(30) + 1;
            System.out.printf("[%2d]", vetorX[i]);

        }

        System.out.println("\n\nVetor Y");

        for (int i = 0; i < vetorY.length; i++) {

            vetorY[i] = rand.nextInt(30) + 1;
            System.out.printf("[%2d]", vetorY[i]);
        }

        System.out.println("\n\nVetor R");

        for (int i = 0; i < vetorX.length; i++) {

            for (int j = 0; j < vetorY.length; j++) {

                if (vetorX[i] == vetorY[j]) {

                    for (int k = 0; k < vetorR.length; k++) {

                        if (vetorX[i] == vetorR[k]) {
                            contadorIgualdade++;
                        }
                    }

                    if (contadorIgualdade == 0) {

                        vetorR[contador] = vetorX[i];
                        contador++;
                    }

                    contadorIgualdade = 0;

                }

            }

        }

        for (int i = 0; i < contador; i++) {

            System.out.printf("[%2d]", vetorR[i]);

        }

        System.out.println("");

    }

}
