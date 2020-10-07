/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 04 B
*/

import java.util.Scanner;

public class L03_EX04_B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorX[] = new int[10];
        int vetorY[] = new int[10];
        int vetorU[] = new int[20];
        int contadorIgualdade = 0;
        int contadorUniao = 0;

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

            for (int j = 0; j <= contadorUniao; j++) {
                if ((vetorU[j] == vetorX[i])) {
                    contadorIgualdade++;
                }
            }

            if (contadorIgualdade == 0 || i == 0) {
                vetorU[contadorUniao] = vetorX[i];
                contadorUniao++;
            }

            contadorIgualdade = 0;
        }

        for (int i = 0; i < vetorX.length; i++) {

            for (int j = 0; j <= contadorUniao; j++) {
                if ((vetorU[j] == vetorY[i])) {
                    contadorIgualdade++;
                }
            }

            if (contadorIgualdade == 0) {
                vetorU[contadorUniao] = vetorY[i];
                contadorUniao++;
            }
            
            contadorIgualdade = 0;
        }

        for (int i = 0; i < contadorUniao; i++) {
            System.out.printf("| %d ", vetorU[i]);
        }

        System.out.println("|");

    }

}
