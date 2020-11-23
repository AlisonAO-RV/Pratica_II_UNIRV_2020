/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 08 - ORDENAÇÃO
* EXERCICIO 03 - InsertionSort
*/

public class L08_EX03{

    public static void main(String[] args) {

        int matriz[][] = {
                { 111, 999, 222, 999, 333, 888, 444, 777, 555, 666, 555 },
                { 89, 79, 32, 38, 46, 26, 43, 48, 33, 179, 24 },
                { 56, 62, 74, 87, 98, 101, 112, 115, 135, 148, 159, },
                { 53, 68, 84, 92, 104, 116, 128, 139, 145, 151, 47, },
                { 302, 286, 254, 231, 209, 193, 182, 174, 155, 122, 84, }
            };
        int aux = 0;
        int x = 0;
        int cont = 1;
        int ComparacaoTrue = 0;
        int ComparacaoFalse = 0;
        int troca = 0;

        for (int[] vetor : matriz) {
            System.out.printf("Vetor %d \n", cont++);
            for (int elemento : vetor) {
                System.out.printf("| %3d ", elemento);
            }
            System.out.println("|");
        }

        System.out.println("");


        cont = 1;
        for (int[] vetor : matriz) {
            aux = 0;
            x = 0;
            ComparacaoTrue = 0;
            ComparacaoFalse = 0;
            troca = 0;
            for (int i = 1; i < vetor.length; i++) {
                aux = vetor[i];
                x = i - 1;

                while ((x >= 0) && (vetor[x] > aux)) {
                    vetor[x + 1] = vetor[x];
                    x = x - 1;
                    ComparacaoTrue++;
                    troca++;
                }
                vetor[x + 1] = aux;
                ComparacaoFalse++;
            }
            System.out.printf("Vetor %d \n", cont++);
            for (int elemento : vetor) {
                System.out.printf("| %3d ", elemento);
            }
            System.out.println("|");
            System.out.printf("| ComparaçãoTrue: %2d | ComparaçãoFalse: %2d |  Total: %2d |\n", ComparacaoTrue, ComparacaoFalse, (ComparacaoTrue + ComparacaoFalse));
            System.out.printf("| Troca: %2d |\n\n", troca);

        }

    }

}
