/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 06 - ORDENAÇÃO
* EXERCICIO 02 - SelectSort
*/

public class L07_EX02 {

    public static void main(String[] args) {

        int vetor[] = { 3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1 };
        int auxiliar = 0;
        int menor = 0;

        System.out.printf("Vetor Original\n");
        for (int i : vetor)
            System.out.printf("| %d ", i);

        System.out.printf("|\n\n");

        for (int i = 0; i < vetor.length - 1; i++) {

            menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > vetor[menor]) {
                    menor = j;
                }
            }

            auxiliar = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = auxiliar;

            for (int k = 0; k < vetor.length; k++) {
                if (k == menor) {
                    System.out.printf("| \33[0;33m%d\33[0m ", vetor[k]);
                } else if (k == i) {
                    System.out.printf("| \33[0;33m%d\33[0m ", vetor[k]);
                } else {
                    System.out.printf("| %d ", vetor[k]);
                }
            }
            System.out.printf("|\n");
        }

        System.out.printf("\nVetor Ordenado\n");
        for (int i : vetor)
            System.out.printf("| %d ", i);

        System.out.printf("|\n");

    }

}
