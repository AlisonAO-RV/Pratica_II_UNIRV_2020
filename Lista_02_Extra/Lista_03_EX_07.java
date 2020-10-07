/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 07
*/

import java.util.Scanner;

public class Lista_03_EX_07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorS[] = new int[20];
        int base = 0;
        int somaProduto = 0;

        System.out.print("Digite valor da base: ");
        base = sc.nextInt();
        System.out.println();

        for (int i = 0; i < vetorS.length; i++) {

            System.out.printf("Digite o valor %d/20: ", (i + 1));
            vetorS[i] = sc.nextInt();
            somaProduto += vetorS[i] * base;

        }

        sc.close();

        System.out.printf("A soma dos produtos é: %d%n", somaProduto);

    }

}