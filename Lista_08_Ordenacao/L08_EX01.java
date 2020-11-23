/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 08 - ORDENAÇÃO
* EXERCICIO 01 - InsertionSort
*/

public class L08_EX01 {

    public static void main(String[] args) {

        int vetor[] = { 302, 286, 254, 231, 209, 193, 182, 174, 155, 122, 84 };
        int aux = 0;
        int x = 0;

        System.out.println("Original");
        for (int i_vetor : vetor) {
            System.out.printf("| %2d ", i_vetor);
        }

        System.out.printf("|\n\nCada Interação\n");

        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            x = i - 1;

            while ((x >= 0) && (vetor[x] < aux)) {
                vetor[x + 1] = vetor[x];
                for (int i_vetor : vetor) {
                    System.out.printf("| %2d ", i_vetor);
                }
                System.out.printf("| %2d < %2d\n", vetor[x], aux);
                x = x - 1;
            }
            vetor[x + 1] = aux;
            for (int i_vetor : vetor) {
                System.out.printf("| %2d ", i_vetor);
            }
            System.out.println("|");
            System.out.println("");
        }

        System.out.println("Ordenação Decrescente");
        for (int i_vetor : vetor) {
            System.out.printf("| %2d ", i_vetor);
        }
        System.out.println("|");
    }

}
