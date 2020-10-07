/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 05
*/

import java.util.Scanner;

public class L03_EX05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorX[] = new int[10];
        int vetorY[] = new int[10];
        int verificador = 0;

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

            for (int j = 0; j < vetorY.length; j++) {

                if (vetorX[i] == vetorY[j]) {
                    verificador = 1;
                }
            }

            if (verificador == 0) {

                System.out.printf("| %d ", vetorX[i]);
            }

            verificador = 0;
        }

        System.out.println("");
    }

}
