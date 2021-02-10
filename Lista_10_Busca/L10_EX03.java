/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 10
* EXERCICIO 03
*/

public class L10_EX03 {

    public static void main(String[] args) {

        int vetor[] = { 99, 16, 31, 33, 72, 77, 37, 41, 10, 49, 53, 68, 57, 27, 69, 84, 89, 95 };
        int vetorBusca[] = { 33, 50, 77, 90, 99 };
        boolean achou = false;

        double tInicio = 0;
        double tFim = 0;

        tInicio = System.currentTimeMillis();

        System.out.printf("\nBuscar Sequencial\n\n");
        for (int i = 0; i < vetorBusca.length; i++) {

            for (int j = 0; j < vetor.length; j++) {
                if (vetorBusca[i] == vetor[j]) {
                    System.out.printf("O Número %d foi Encontrado na Posição %d\n", vetorBusca[i], j + 1);
                    achou = true;
                }
            }
            if (achou == false) {
                System.out.printf("O Número %d Não foi Encontrado\n", vetorBusca[i]);
            }
            achou = false;
        }

        tFim = System.currentTimeMillis();
        System.out.printf("\nTempo gasto: %.5f ms\n", (tFim - tInicio) /1000);

    }

}
