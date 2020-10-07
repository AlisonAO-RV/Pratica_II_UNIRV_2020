/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 13
*/

import java.util.Scanner;

public class Lista_03_EX_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorS[] = new int[20];
        int ultimaPosicao = 20;

        for (int i = 0; i < vetorS.length; i++) {

            System.out.printf("Digite o valor %d/20: ", (i + 1));
            vetorS[i] = sc.nextInt();

        }

        sc.close();

        for (int i = 0; i < ultimaPosicao; i++) {

            if (vetorS[i] < 1) {

                for (int j = i; j < vetorS.length - 1; j++) {

                    vetorS[j] = vetorS[(j + 1)];

                }

                vetorS[ultimaPosicao - 1] = 0;
                ultimaPosicao--;
                i--;

            }

        }

        for (int i = 0; i < ultimaPosicao; i++) {

            System.out.printf("Posição %d: %d%n", (i + 1), vetorS[i]);

        }
    }

}
