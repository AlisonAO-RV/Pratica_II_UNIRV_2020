/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 06 - ORDENAÇÃO
* EXERCICIO 01
*/

public class L06_EX01 {

    public static void main(String[] args) {

        int vetor[] = { 3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1 };
        int auxiliar = 0;

        System.out.printf("Vetor Original\n");

        for (int i : vetor)
            System.out.printf("| %d ", i);

        System.out.printf("|");

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                
                if (vetor[j] < vetor[j + 1]) {
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
