/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* EXERCICIO BÔNUS
*/

import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorK[] = { 1, 3, 5, 2, 4, 6, 7, 8, 9, 10 }; // VETOR TEMPORARIO
        int auxiliar = 0;

        /*
         * PREENCHIMENTO MANUAL DO VETOR ( USANDO VELORES FIXO PARA ENTENDER A LÓGICA )
         *
         * int vetorK[] = new int[10];
         *
         * for (int i = 0; i < vetorK.length; i++) {
         * System.out.printf("Digite a valor %d/30: ", (i + 1)); vetorK[i] =
         * sc.nextInt(); }
         */

        for (int i = 0; i < vetorK.length; i++) { // MOSTRA VALOR ORIGINAL PARA COMPARAÇÃO
            System.out.printf("%d ", vetorK[i]);
        }

        sc.close();

        for (int i = 0; i < vetorK.length; i++) {

            if (vetorK[i] % 2 == 1) {
                auxiliar = vetorK[i];

                for (int j = i + 1; j < vetorK.length; j++) {
                    if (vetorK[j] % 2 == 0) {
                        vetorK[i] = vetorK[j];
                        vetorK[j] = auxiliar;
                        j = vetorK.length;
                    }
                }
            }
        }

        System.out.println("");

        for (int i = 0; i < vetorK.length; i++) { // MOSTRA RESULTADO

            System.out.printf("%d ", vetorK[i]);

        }

    }

}

/* LÓGICA APLICADA NA SUBISTITUIÇÃO
 *
 * (1)  3   5  (2)  4   6   7   8   9   10
 *  2  (3)  5   1  (4)  6   7   8   9   10
 *  2   4  (5)  1   3  (6)  7   8   9   10
 *  2   4   6  (1)  3   5   7  (8)  9   10
 *  2   4   6   8  (3)  5   7   1   9  (10)
 *  2   4   6   8   10  5   7   1   9   3
 */
