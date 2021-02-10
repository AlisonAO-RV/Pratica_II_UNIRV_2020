/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 10
* EXERCICIO 04
*/

public class L10_EX04 {

    public static void main(String[] args) {

        int vetor[] = { 99, 16, 31, 33, 72, 77, 37, 41, 10, 49, 53, 68, 57, 27, 69, 84, 89, 95 };
        int vetorBusca[] = { 33, 50, 77, 90, 99 };
        int auxiliar = 0;
        int inicio = 0;
        int bfinal = 0;
        int meio = 0;
        boolean achou = false;
        double tInicio = 0;
        double tFim = 0;

        
        tInicio = System.currentTimeMillis();
        System.out.printf("\nBuscar Binária\n\n");
        
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i; j++) {
                
                if (vetor[j] > vetor[j + 1]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar;
                }
            }
        }
        
        for (int i : vetor)
        System.out.printf("| %d ", i);
        
        System.out.printf("|\n\n");

        for (int i = 0; i < vetorBusca.length; i++) {

            inicio = 0;
            meio = 0;
            bfinal = vetor.length - 1;

            while (inicio <= bfinal && achou == false) {

                meio = ((inicio + bfinal) / 2);

                if (vetor[meio] == vetorBusca[i]) {
                    System.out.printf("O Número %d foi Encontrado na Posição %d\n", vetorBusca[i], meio + 1);
                    achou = true;
                    break;
                }
                if (vetor[meio] > vetorBusca[i]) {
                    bfinal = meio - 1;
                } else {
                    inicio = meio + 1;
                }

            }

            if (achou == false) {
                System.out.printf("O Número %d Não foi Encontrado\n", vetorBusca[i]);
            }
            achou = false;
        }
        tFim = System.currentTimeMillis();
        System.out.printf("\nTempo gasto: %.5f ms\n", (tFim - tInicio) / 1000);

    }

}
