/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 04
*/

import java.util.Scanner;

public class L03_EX04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorX[] = new int[10];
        int vetorY[] = new int[10];
        int contador = 0;

        System.out.println("");

        for (int i = 0; i < vetorX.length; i++) {
            System.out.printf("Digite o valor %d/10 de X: ", (i + 1));
            vetorX[i] = sc.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < vetorY.length; i++) {
            System.out.printf("Digite o valor %d/10 de Y: ", (i + 1));
            vetorY[i] = sc.nextInt();
        }

        sc.close();
        System.out.println("");

        for (int i = 0; i < vetorX.length; i++) {

            for (int j = i; (j < vetorX.length) && (contador < 2); j++) {
                if ((vetorX[i] == vetorX[j])) {
                    contador++;
                }
            }

            if (contador == 1) {
                System.out.printf("| %d ", vetorX[i]);
            }

            contador = 0;
        }

        for (int i = 0; i < vetorY.length; i++) {

            for (int j = 0; (j < vetorY.length) && (contador < 1); j++) {

                if (vetorY[i] == vetorX[j]) {
                    contador++;
                }

            }

            if (contador == 0) {

                contador = 0;

                for (int j = i; (j < vetorY.length) && (contador < 2); j++) {

                    if (vetorY[i] == vetorY[j]) {
                        contador++;
                    }
                }

                if (contador == 1) {
                    System.out.printf("| %d ", vetorY[i]);
                }
            }

            contador = 0;
        }

        System.out.println("|");

    }

}
