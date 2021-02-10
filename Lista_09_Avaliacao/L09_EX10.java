/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 10
*/

import java.util.Random;

public class L09_EX10 {

    public static void main(String[] args) {

        Random rand = new Random();

        int MatrizA[][] = new int[10][10];
        int auxiliarI = 0;
        int auxiliarI2 = 0;
        int j2 = 0;
        int i2 = 0;
        int auxiliar = 0;

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                MatrizA[i][j] = rand.nextInt(50) + 1;
            }
        }

        System.out.printf("\n\33[0;33m| MATRIZ ORIGINAL  \33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {

            for (int j = 0; j < MatrizA[i].length; j++) {

                if (i == ((MatrizA[i].length - 1) - j)) {
                    System.out.printf("| \33[0;33m%2d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| %2d ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }

        for (int i = 0; i < MatrizA.length - 1; i++) {
            auxiliarI = i;
            auxiliarI2 = ((MatrizA.length -1 ) -i);
            
            for (int j = i + 1; j < MatrizA.length; j++) {
                i2 = ((MatrizA.length -1 ) -i);
                j2 = ((MatrizA.length -1 ) -j);

                if (MatrizA[j][j2] < MatrizA[auxiliarI][auxiliarI2]) {
                    auxiliarI = j;
                    auxiliarI2 = j2;
                }

            }
            if (auxiliarI != i) {
                auxiliar = MatrizA[auxiliarI][auxiliarI2];
                MatrizA[auxiliarI][auxiliarI2] = MatrizA[i][i2];
                MatrizA[i][i2] = auxiliar;
            }
        }
        
        System.out.printf("\n\33[0;33m| RESULTADO     \33[0m\n");
        for (int i = 0; i < MatrizA.length; i++) {

            for (int j = 0; j < MatrizA[i].length; j++) {

                if (i == ((MatrizA[i].length - 1) - j)) {
                    System.out.printf("| \33[0;33m%2d\33[0m ", MatrizA[i][j]);
                } else {
                    System.out.printf("| %2d ", MatrizA[i][j]);
                }
            }
            System.out.printf("|\n");
        }

    }

}
