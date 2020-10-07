/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* EXERCICIO BÔNUS
*/

import java.util.Scanner;

public class Bonus2 {

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
            for (int j = i; (j < vetorK.length) && vetorK[i] % 2 == 1; j++) {
                    auxiliar = vetorK[i];
                    vetorK[i] = vetorK[j];
                    vetorK[j] = auxiliar;
            }
        }

        System.out.println("");

        for (int i = 0; i < vetorK.length; i++) { // MOSTRA RESULTADO

            System.out.printf("%d ", vetorK[i]);

        }

    }

}
