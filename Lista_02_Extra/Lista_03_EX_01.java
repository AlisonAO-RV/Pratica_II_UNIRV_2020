/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 01
*/

import java.util.Scanner;

public class Lista_03_EX_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorV[] = new int[6];
        int contadorNegativo = 0;

        for (int i = 0; i < vetorV.length; i++) {

            System.out.printf("Digite o %d° Número:", i + 1);
            vetorV[i] = sc.nextInt();

            if (vetorV[i] < 0) {
                contadorNegativo++;
            }

        }

        sc.close();

        System.out.printf("%nQuantidade de Números Negativos: %d %n", contadorNegativo);

        for (int i = 0; i < vetorV.length; i++) {

            if (vetorV[i] < 0) {
                System.out.printf("| Posição %d: |  Valor: %d |%n", i, vetorV[i]);
            }

        }

    }

}