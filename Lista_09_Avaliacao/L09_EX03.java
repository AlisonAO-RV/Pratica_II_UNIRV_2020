/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 03
*/

// import java.util.Random;
import java.util.Scanner;

public class L09_EX03 {

    public static void main(String[] args) {

        // Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int MatrizA[][] = {
            {142, 141, 140, 143, 144, 145, 146},
            {151, 152, 153, 154, 150, 155, 156},
            {130, 121, 132, 133, 134, 135, 136},
            {120, 131, 122, 123, 124, 125, 126},
            {110, 111, 112, 113, 114, 115, 116},
        };

        // int MatrizA[][] = new int[5][7];
        int Aux = 0;
        int Aux2 = 0;
        int pos = 0;
        int pos2 = 0;
        int cont = 0;

        // for (int i = 0; i < MatrizA.length; i++) {
        //     for (int j = 0; j < MatrizA[i].length; j++) {
        //         MatrizA[i][j] = rand.nextInt(999) + 1;
        //     }
        // }


        System.out.printf("\n\33[0;33mMATRIZ\33[0m\n");
        System.out.printf("  \33[0;33m   0     1     2     3     4     5     6   \33[0m\n");
        for (int[] MatrizL : MatrizA) {
            System.out.printf("\33[0;33m%d\33[0m ", cont++);
            for (int MatrizC : MatrizL) {
                System.out.printf("| %3d ", MatrizC);
            }
            System.out.printf("|\n");
        }

        sc.close();

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {

                Aux = MatrizA[i][j];
                for (int k = 0; k < MatrizA[i].length; k++) {
                    if (Aux > MatrizA[i][k]) {
                        Aux = MatrizA[i][k];
                        pos = k;
                    }
                }
            }
            // System.out.printf("Linha: %d - %d\n", i, pos);
            Aux2 = MatrizA[i][pos];
            for (int k = 0; k < MatrizA.length; k++) {
                if (Aux2 < MatrizA[k][pos]) {
                    Aux2 = MatrizA[k][pos];
                    pos2 = k;
                }
            }
            // System.out.printf("Linha: %d\n\n", pos2);

                if (Aux == Aux2) {   
                    System.out.printf("\n\33[0;33mRESULTADO\33[0m\n");
                    System.out.printf("Linha: \33[0;33m%d\33[0m | Coluna: \33[0;33m%d\33[0m\n\n\n", i, pos);
                }

        }

    }

}
