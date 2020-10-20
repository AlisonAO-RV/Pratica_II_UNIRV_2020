/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 06 - ORDENAÇÃO
* EXERCICIO 04
*/

public class L06_EX04 {

    public static void main(String[] args) {

        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int auxiliar = 0;

        System.out.printf("Vetor Original\n");

        for (int i : vetor)
            System.out.printf("| %d ", i);

        System.out.printf("|");

        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i; j++) {

                if (vetor[j] > vetor[j + 1]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar;
                }
            }
        }

        System.out.printf("\nVetor Ordenado Decresente\n");

        for (int i : vetor)
            System.out.printf("| %d ", i);

        System.out.printf("|\n\n");

    }
}
