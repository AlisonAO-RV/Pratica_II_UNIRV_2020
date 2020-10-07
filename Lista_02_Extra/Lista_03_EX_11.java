/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 11
*/

import java.util.Scanner;

public class Lista_03_EX_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gabaritoG[] = new int[13];
        int respostaR[] = new int[13];
        int apostadores[] = new int[10];
        int contadorAcertos = 0;
        int conferencia = 0;

        System.out.println("Digite o Resultado da Loteria");

        for (int i = 0; i < gabaritoG.length; i++) {

            System.out.printf("Resultado %d/13: ", (i + 1));
            gabaritoG[i] = sc.nextInt();

        }

        System.out.printf("%nCONFIRA OS RESULTADOS%n");

        for (int i = 0; i < apostadores.length; i++) {

            System.out.printf("Apostador %d%n%n", (i + 1));

            for (int j = 0; j < respostaR.length; j++) {

                System.out.printf("Resultado %d/13: ", (j + 1));
                respostaR[j] = sc.nextInt();

            }

            System.out.printf("%nRESULTADO%n");

            for (int k = 0; k < gabaritoG.length; k++) {

                if (gabaritoG[k] == respostaR[k]) {

                    contadorAcertos++;
                    conferencia = 1;

                } else {

                    conferencia = 0;

                }

                if (gabaritoG[k] == 1) {

                    System.out.printf("| X |   |   | = %d pontos%n", conferencia);

                } else if (gabaritoG[k] == 0) {

                    System.out.printf("|   | X |   | = %d pontos%n", conferencia);

                } else {

                    System.out.printf("|   |   | X | = %d pontos%n", conferencia);

                }
            }

            System.out.printf("%nTotal de Pontos %d%n%n", contadorAcertos);

            apostadores[i] = contadorAcertos;
            contadorAcertos = 0;
            conferencia = 0;

        }

        sc.close();

        System.out.printf("%nRELATÓRIO%n%n");

        for (int i = 0; i < apostadores.length; i++) {

            System.out.printf("Apostador %d fez %d pontos%n", (i + 1), apostadores[i]);
        }

    }

}