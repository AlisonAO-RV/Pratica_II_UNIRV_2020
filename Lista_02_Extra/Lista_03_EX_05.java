/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 05
*/

import java.util.Scanner;

public class Lista_03_EX_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorK[] = new int[30];
        int auxiliarImpar = 0;
        int auxiliarPar = 0;
        int posicao = 0;
        boolean impar = false;

        for (int i = 0; i < vetorK.length; i++) {

            System.out.printf("Digite a valor %d/30: ", (i + 1));
            vetorK[i] = sc.nextInt();

        }

        sc.close();

        for (int i = 0; i < vetorK.length; i++) {

            if (vetorK[i] % 2 == 1) {

                auxiliarImpar = vetorK[i];
                posicao = i;
                impar = true;

            }

            if ((vetorK[i] % 2 == 0) && (impar == true)) {

                auxiliarPar = vetorK[i];
                vetorK[posicao] = auxiliarPar;
                vetorK[i] = auxiliarImpar;
                impar = false;

            }

        }

        for (int i = 0; i < vetorK.length; i++) {

            System.out.printf("Posição %d: %d%n", (i + 1), vetorK[i]);
            
        }

    }

}