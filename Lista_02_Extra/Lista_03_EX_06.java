/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 06
*/

import java.util.Scanner;

public class Lista_03_EX_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorD[] = new int[10];
        int auxiliar = 0;

        for (int i = 0; i < vetorD.length; i++) {

            System.out.printf("Digite a valor %d/60: ", (i + 1));
            vetorD[i] = sc.nextInt();

        }

        sc.close();

        for (int i = 0; i < (vetorD.length / 2); i++) {

            auxiliar = vetorD[i];
            vetorD[i] = vetorD[(i + (vetorD.length / 2))];
            vetorD[(i + (vetorD.length / 2))] = auxiliar;

        }

        for (int i = 0; i < vetorD.length; i++) {

            System.out.printf("Posição %d: %d%n", (i + 1), vetorD[i]);

        }
    }

}