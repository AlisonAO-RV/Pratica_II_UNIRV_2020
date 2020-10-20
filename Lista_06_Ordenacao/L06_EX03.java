/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 06 - ORDENAÇÃO
* EXERCICIO 03
*/

public class L06_EX03 {

    public static void main(String[] args) {

        int vetorA[] = { 7, 13, 3, 4, 20, 5, 8, 9, 12, 10, 8, 7, 5, 2, 2, 3, 6, 1 };
        int vetorB[] = { 20, 18, 14, 13, 12, 10, 9, 8, 7, 4, 3, 2, 1 };
        int vetorC[] = { 1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 15, 18, 20 };
        int auxiliar = 0;
        int contTroca = 0;
        int contComparacao = 0;

        System.out.printf("Vetor A Original\n");
        for (int i : vetorA)
            System.out.printf("| %d ", i);

        System.out.printf("|\n");

        auxiliar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length - 1; j++) {
                if (vetorA[j] > vetorA[j + 1]) {
                    auxiliar = vetorA[j];
                    vetorA[j] = vetorA[j + 1];
                    vetorA[j + 1] = auxiliar;
                    contTroca++;
                }
                contComparacao++;
            }
        }

        System.out.printf("Vetor A Ordenado\n");
        for (int i : vetorA)
            System.out.printf("| %d ", i);

        System.out.printf("| \nTroca: %d  - Compracação: %d", contTroca, contComparacao);

        // ---------------------------------------------

        System.out.printf("\n\nVetor B Original\n");
        for (int i : vetorB)
            System.out.printf("| %d ", i);

        System.out.printf("|\n");

        contTroca = 0;
        contComparacao = 0;
        auxiliar = 0;
        for (int i = 0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorB.length - 1; j++) {
                if (vetorB[j] > vetorB[j + 1]) {
                    auxiliar = vetorB[j];
                    vetorB[j] = vetorB[j + 1];
                    vetorB[j + 1] = auxiliar;
                    contTroca++;
                }
                contComparacao++;
            }
        }

        System.out.printf("Vetor B Ordenado\n");
        for (int i : vetorB)
            System.out.printf("| %d ", i);

        System.out.printf("| \nTroca: %d  - Compracação: %d", contTroca, contComparacao);

        // ---------------------------------------------

        System.out.printf("\n\nVetor C Original\n");
        for (int i : vetorC)
            System.out.printf("| %d ", i);

        System.out.printf("|\n");

        contTroca = 0;
        contComparacao = 0;
        auxiliar = 0;
        for (int i = 0; i < vetorC.length; i++) {
            for (int j = 0; j < vetorC.length - 1; j++) {
                if (vetorC[j] > vetorC[j + 1]) {
                    auxiliar = vetorC[j];
                    vetorC[j] = vetorC[j + 1];
                    vetorC[j + 1] = auxiliar;
                    contTroca++;
                }
                contComparacao++;
            }
        }

        System.out.printf("Vetor C Ordenado\n");
        for (int i : vetorC)
            System.out.printf("| %d ", i);

        System.out.printf("| \nTroca: %d  - Compracação: %d\n", contTroca, contComparacao);

    }

}
