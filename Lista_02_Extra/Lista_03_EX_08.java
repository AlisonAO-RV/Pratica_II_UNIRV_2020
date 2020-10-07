/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 08
*/

import java.util.Scanner;

public class Lista_03_EX_08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorF[] = new int[20];
        int vetorG[] = new int[20];

        System.out.println("| Digite valores do VetorF");

        for (int i = 0; i < vetorF.length; i++) {

            System.out.printf("| %d/20: ", (i + 1));
            vetorF[i] = sc.nextInt();

        }

        System.out.println("| Digite valores do VetorG");

        for (int i = 0; i < vetorG.length; i++) {

            System.out.printf("| %d/20: ", (i + 1));
            vetorG[i] = sc.nextInt();

        }

        sc.close();

        for (int i = 0; i < vetorG.length; i++) {

            System.out.printf("| %02d:  %02d x %02d = %03d%n", (i + 1), vetorF[i], vetorG[i], (vetorF[i] * vetorG[i]));
            
        }

    }

}