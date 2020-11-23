/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 06 - ORDENAÇÃO
* EXERCICIO 04 - SelectSort
*/

public class L07_EX04 {
    public static void main(String[] args) {

        int vetor[] = {302, 286, 254, 231, 209, 193, 182, 174, 155, 122, 84};

        int auxiliar = 0;
        int menor = 0;
        int cont = 0;

        int contadorTroca = 0;
        int contadorComparacao = 0;

        System.out.printf("Vetor Original\n");
        for (int i : vetor) {
            System.out.printf("| %3d ", i);
            cont++;
            if (cont == 11) {
                System.out.printf("|\n");
                cont = 0;
            }
        }
        System.out.printf("\n");

        for (int i = 0; i < vetor.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < vetor.length; j++) {

                System.out.printf("%d > %d\n", vetor[j],  vetor[menor]);
                if (vetor[j] > vetor[menor]) {
                    menor = j;
                }
                contadorComparacao++;
            }
            if (menor != i) {
                auxiliar = vetor[menor];
                vetor[menor] = vetor[i];
                vetor[i] = auxiliar;
                contadorTroca++;
            }
        }

        System.out.printf("Vetor Ordenado\n");
        for (int i : vetor) {
            System.out.printf("| %3d ", i);
            cont++;
            if (cont == 11) {
                System.out.printf("|\n");
                cont = 0;
            }
        }
        System.out.printf("\n");

        System.out.printf("Comparação: %d \n", contadorComparacao);
        System.out.printf("Troca: %d \n", contadorTroca);

    }
}
