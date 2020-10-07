/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 09
*/

import java.util.Scanner;

public class Lista_03_EX_09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorK[] = new int[10];
        int vetorN[] = new int[10];
        int vetorM[] = new int[10];

        System.out.printf("| Digite valores do VetorK%n");

        for (int i = 0; i < vetorK.length; i++) {

            System.out.printf("| %d/10: ", (i + 1));
            vetorK[i] = sc.nextInt();

        }

        System.out.printf("| Digite valores do VetorN%n");

        for (int i = 0; i < vetorN.length; i++) {

            System.out.printf("| %d/10: ", (i + 1));
            vetorN[i] = sc.nextInt();

        }

        sc.close();

        for (int i = 0; i < vetorM.length; i++) {

            vetorM[i] = vetorK[i] - vetorN[i];
            System.out.printf("| %02d:  %02d x %02d  =  %03d%n", (i + 1), vetorK[i], vetorN[i], vetorM[i]);
        }
    }

}