/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 04
*/

import java.util.Scanner;

public class Lista_03_EX_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorN[] = new int[20];
        int auxiliar = 0;
        int contadorInverso = 20;

        for (int i = 0; i < vetorN.length; i++) {

            System.out.printf("Digite o valor %d/20: ", (i + 1));
            vetorN[i] = sc.nextInt();

        }

        sc.close();

        for (int i = 0; i < (vetorN.length / 2); i++) {

            contadorInverso--;
            auxiliar = vetorN[i];
            vetorN[i] = vetorN[contadorInverso];
            vetorN[contadorInverso] = auxiliar;

        }

        for (int i = 0; i < vetorN.length; i++) {
            System.out.printf("Posição %d: %d%n", (i + 1), vetorN[i]);
        }

    }

}