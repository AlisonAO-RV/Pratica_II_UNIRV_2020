/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 06 - ORDENAÇÃO
* EXERCICIO 03 - SelectSort
*/

public class L07_EX03 {

    public static void main(String[] args) {

        int vetor[] = { 111, 999, 222, 999, 333, 888, 444, 777, 555, 666, 555, 89, 79, 32, 38, 46, 26, 43, 48, 33, 179,
                24, 56, 62, 74, 87, 98, 101, 112, 115, 135, 148, 159, 53, 68, 84, 92, 104, 116, 128, 139, 145, 151, 47,
                302, 286, 254, 231, 209, 193, 182, 174, 155, 122, 84 };

        int auxiliar = 0;
        int menor = 0;
        int cont = 0;

        System.out.printf("Vetor Original\n");
        for (int i : vetor) {
            System.out.printf("| %3d ", i);
            cont++;
            if (cont == 11) {
                System.out.printf("|\n");
                cont = 0;
            }
        }
        System.out.printf("|\n");

        for (int i = 0; i < vetor.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            auxiliar = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = auxiliar;
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
        System.out.printf("|\n");

    }
}
