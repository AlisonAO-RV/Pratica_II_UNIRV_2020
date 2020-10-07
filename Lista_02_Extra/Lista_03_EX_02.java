/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 02
*/

import java.util.Scanner;

public class Lista_03_EX_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorA[] = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Digite o %d° Número: ", i + 1);
            vetorA[i] = sc.nextInt();

        }

        sc.close();

        System.out.printf("%nResultado e Posições Menores que 10%n%n");

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] <= 10) {
                System.out.printf("| Posição %d: |  Valor: %d |%n", (i + 1), vetorA[i]);
            }
        }
    }

}