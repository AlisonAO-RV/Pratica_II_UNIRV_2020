/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* EXERCICIO BÔNUS
*/

import java.util.Scanner;

public class Bonus3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorK[] = { 1, 3, 5, 2, 4, 6, 7, 8, 9, 10 }; // VETOR TEMPORARIO PARA TESTES
        int auxiliar = 0;

        
        //   PREENCHIMENTO MANUAL DO VETOR ( USANDO VELORES TEMPORARIO PARA ENTENDER A LÓGICA )
         
        //   int vetorK[] = new int[30];
         
        //   for (int i = 0; i < vetorK.length; i++) {
        //      System.out.printf("Digite a valor %d/30: ", (i + 1));
        //      vetorK[i] =  sc.nextInt(); 
        //  }
        
        sc.close();

        for (int i = 0; i < vetorK.length; i++) { // MOSTRA VALOR ORIGINAL PARA COMPARAÇÃO
            System.out.printf("%d ", vetorK[i]);
        }

        for (int i = 0; i < vetorK.length; i++) {
            for (int j = i + 1; ( (j < vetorK.length) && (vetorK[i] % 2 == 1) && (vetorK[j - 1] % 2 == 1) ); j++) {
                if (vetorK[j] % 2 == 0) {
                    auxiliar = vetorK[i];
                    vetorK[i] = vetorK[j];
                    vetorK[j] = auxiliar;
                }
            }
        }

        System.out.println("");

        for (int i = 0; i < vetorK.length; i++) { // MOSTRA RESULTADO
            System.out.printf("%d ", vetorK[i]);
        }

        System.out.println("");

    }

}

/* LÓGICA APLICADA NA SUBISTITUIÇÃO DO VETOR TEMPORARIO
 *
 * (1)  3   5  (2)  4   6   7   8   9   10
 *  2  (3)  5   1  (4)  6   7   8   9   10
 *  2   4  (5)  1   3  (6)  7   8   9   10
 *  2   4   6  (1)  3   5   7  (8)  9   10
 *  2   4   6   8  (3)  5   7   1   9  (10)
 *  2   4   6   8   10  5   7   1   9   3
 */
