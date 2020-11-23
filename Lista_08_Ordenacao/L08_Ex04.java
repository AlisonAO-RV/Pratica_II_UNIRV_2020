/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 08 - ORDENAÇÃO
* EXERCICIO 04 - InsertionSort
*/

import java.util.Random;

public class L08_Ex04 {

    public static void main(String[] args) {

        Random rand = new Random();

        final int tamanhoGrande = 100000;
        int vetorG_Aleatorio1[] = new int[tamanhoGrande];
        int vetorG_Ordenado[] = new int[tamanhoGrande];
        int vetorG_Dedordenado[] = new int[tamanhoGrande];

        final int tamanhoPequeno = 5000;
        int vetorP_Aleatorio1[] = new int[tamanhoPequeno];
        int vetorP_Ordenado[] = new int[tamanhoPequeno];
        int vetorP_Dedordenado[] = new int[tamanhoPequeno];

        int tamanhoAuxiliar = 0;
        int vetorAuxiliar1[];
        int vetorAuxiliar2[];
        int vetorAuxiliar3[];
        int auxOrdenacao = 0;
        int auxMinimo = 0;
        int xInsertion = 0;

        int posicao[] = new int[3];
        double ranking[] = new double[3];
        int auxPosicao = 0;
        double auxRanking = 0;
        double tInicio = 0;
        double tFim = 0;

        for (int i = 0; i < tamanhoGrande; i++) {
            vetorG_Aleatorio1[i] = rand.nextInt(1000) + 1;
            vetorG_Ordenado[i] = i + 1;
            vetorG_Dedordenado[i] = tamanhoGrande - i;
        }

        for (int i = 0; i < tamanhoPequeno; i++) {
            vetorP_Aleatorio1[i] = rand.nextInt(1000) + 1;
            vetorP_Ordenado[i] = i + 1;
            vetorP_Dedordenado[i] = tamanhoPequeno - i;
        }

        for (int i = 0; i < 6; i++) {

            if (i < 3) {
                tamanhoAuxiliar = tamanhoGrande;
                vetorAuxiliar1 = new int[tamanhoAuxiliar];
                vetorAuxiliar2 = new int[tamanhoAuxiliar];
                vetorAuxiliar3 = new int[tamanhoAuxiliar];
            } else {
                tamanhoAuxiliar = tamanhoPequeno;
                vetorAuxiliar1 = new int[tamanhoAuxiliar];
                vetorAuxiliar2 = new int[tamanhoAuxiliar];
                vetorAuxiliar3 = new int[tamanhoAuxiliar];
            }

            for (int j = 0; j < tamanhoAuxiliar; j++) {
                switch (i) {
                    case 0:
                        vetorAuxiliar1[j] = vetorG_Aleatorio1[j];
                        vetorAuxiliar2[j] = vetorG_Aleatorio1[j];
                        vetorAuxiliar3[j] = vetorG_Aleatorio1[j];
                        break;
                    case 1:
                        vetorAuxiliar1[j] = vetorG_Ordenado[j];
                        vetorAuxiliar2[j] = vetorG_Ordenado[j];
                        vetorAuxiliar3[j] = vetorG_Ordenado[j];
                        break;
                    case 2:
                        vetorAuxiliar1[j] = vetorG_Dedordenado[j];
                        vetorAuxiliar2[j] = vetorG_Dedordenado[j];
                        vetorAuxiliar3[j] = vetorG_Dedordenado[j];
                        break;
                    case 3:
                        vetorAuxiliar1[j] = vetorP_Aleatorio1[j];
                        vetorAuxiliar2[j] = vetorP_Aleatorio1[j];
                        vetorAuxiliar3[j] = vetorP_Aleatorio1[j];
                        break;
                    case 4:
                        vetorAuxiliar1[j] = vetorP_Ordenado[j];
                        vetorAuxiliar2[j] = vetorP_Ordenado[j];
                        vetorAuxiliar3[j] = vetorP_Ordenado[j];
                        break;
                    case 5:
                        vetorAuxiliar1[j] = vetorP_Dedordenado[j];
                        vetorAuxiliar2[j] = vetorP_Dedordenado[j];
                        vetorAuxiliar3[j] = vetorP_Dedordenado[j];
                        break;
                }
            }

            // Bubble Sort -----------------------------------------
            auxOrdenacao = 0;
            tInicio = System.currentTimeMillis();
            for (int k = 0; k < tamanhoAuxiliar; k++) {
                for (int l = 0; l < tamanhoAuxiliar - 1; l++) {
                    if (vetorAuxiliar1[l] < vetorAuxiliar1[l + 1]) {
                        auxOrdenacao = vetorAuxiliar1[l];
                        vetorAuxiliar1[l] = vetorAuxiliar1[l + 1];
                        vetorAuxiliar1[l + 1] = auxOrdenacao;
                    }
                }
            }
            tFim = System.currentTimeMillis();
            posicao[0] = 1;
            ranking[0] = (tFim - tInicio);

            // Selection Sort -----------------------------------------
            auxOrdenacao = 0;
            auxMinimo = 0;
            tInicio = System.currentTimeMillis();
            for (int k = 0; k < tamanhoAuxiliar - 1; k++) {
                auxMinimo = k;
                for (int l = k + 1; l < tamanhoAuxiliar; l++) {
                    if (vetorAuxiliar2[auxMinimo] > vetorAuxiliar2[l]) {
                        auxMinimo = l;
                    }
                }
                if (i != auxMinimo) {
                    auxOrdenacao = vetorAuxiliar2[k];
                    vetorAuxiliar2[k] = vetorAuxiliar2[auxMinimo];
                    vetorAuxiliar2[auxMinimo] = auxOrdenacao;
                }
            }
            tFim = System.currentTimeMillis();
            posicao[1] = 2;
            ranking[1] = (tFim - tInicio);

            // Insertion Sort -----------------------------------------
            auxOrdenacao = 0;
            xInsertion = 0;
            tInicio = System.currentTimeMillis();
            for (int k = 1; k < tamanhoAuxiliar; k++) {
                auxOrdenacao = vetorAuxiliar3[k];
                xInsertion = k - 1;
                while ((xInsertion >= 0) && (vetorAuxiliar3[xInsertion] > auxOrdenacao)) {
                    vetorAuxiliar3[xInsertion + 1] = vetorAuxiliar3[xInsertion];
                    xInsertion = xInsertion - 1;
                }
                vetorAuxiliar3[xInsertion + 1] = auxOrdenacao;
            }
            tFim = System.currentTimeMillis();
            posicao[2] = 3;
            ranking[2] = (tFim - tInicio);

            System.out.println();

            for (int k = 0; k < 2; k++) {
                for (int l = k + 1; l < 3; l++) {
                    if (ranking[k] > ranking[l]) {
                        auxPosicao = posicao[k];
                        auxRanking = ranking[k];
                        posicao[k] = posicao[l];
                        ranking[k] = ranking[l];
                        posicao[l] = auxPosicao;
                        ranking[l] = auxRanking;
                    }
                }
            }

            System.out.println();

            switch (i) {
                case 0:
                    System.out.printf("  \33[0;36m Vetor Grande Aleatorio \33[0m\n");
                    break;
                case 1:
                    System.out.printf("  \33[0;36m Vetor Grande Ordenado \33[0m\n");
                    break;
                case 2:
                    System.out.printf("  \33[0;36m Vetor Grande Desordenado \33[0m\n");
                    break;
                case 3:
                    System.out.printf("  \33[0;36m Vetor Pequeno Aleatorio \33[0m\n");
                    break;
                case 4:
                    System.out.printf("  \33[0;36m Vetor Pequeno Ordenado \33[0m\n");
                    break;
                case 5:
                    System.out.printf("  \33[0;36m Vetor Pequeno Desordenado \33[0m\n");
                    break;
            }

            for (int j = 0; j < 3; j++) {
                switch (posicao[j]) {
                    case 1:
                        System.out.printf("%d° Bubble:    \33[0;32m%10.4f ms\33[0m ou %7.4f seg\n", (j + 1), ranking[j],
                                (ranking[j] / 1000));
                        break;
                    case 2:
                        System.out.printf("%d° Selection: \33[0;32m%10.4f ms\33[0m ou %7.4f seg\n", (j + 1), ranking[j],
                                (ranking[j] / 1000));
                        break;
                    case 3:
                        System.out.printf("%d° Insertion: \33[0;32m%10.4f ms\33[0m ou %7.4f seg\n", (j + 1), ranking[j],
                                (ranking[j] / 1000));
                        break;
                }
            }

        }

    }

}
