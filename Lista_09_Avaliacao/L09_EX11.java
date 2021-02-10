/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 11
*/

import java.util.Random;

public class L09_EX11 {

    public static void main(String[] args) {
        
        Random rand = new Random();

        int MatrizA[][] = new int[10][10];
        int aux = 0;
        int X = 0;

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                MatrizA[i][j] = rand.nextInt(50) + 1;
            }
        }

        

        System.out.printf("\n\33[0;33m| MATRIZ ORIGINAL  \33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {

            for (int j = 0; j < MatrizA[i].length; j++) {

                if (i == j) {
                    System.out.printf("| \33[0;33m%2d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| %2d ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }

        
        
        for (int k = 1; k <  MatrizA.length; k++) {
            aux = MatrizA[k][k];
            X = k - 1;
            while ((X >= 0) && (MatrizA[X][X] > aux)) {
                MatrizA[X + 1][X + 1] = MatrizA[X][X];
                X = X - 1;
            }
            MatrizA[X + 1][X + 1] = aux;
        }

        System.out.printf("\n\33[0;33m| RESULTADO     \33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {

            for (int j = 0; j < MatrizA[i].length; j++) {

                if (i == j) {
                    System.out.printf("| \33[0;33m%2d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| %2d ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }
    }
    
}
