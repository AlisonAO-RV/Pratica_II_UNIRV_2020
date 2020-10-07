/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 02 - Vetor
* EXERCICIO 02
*/

import java.util.Scanner;

public class Lista_2_Ex_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valores[] = new int[10];
        int somaElementos = 0;
        int somaPares = 0;
        int somaPosicoes = 0;
        int somaAcimaMedia = 0;

        for (int i = 0; i < valores.length; i++) {

            System.out.printf(" Digite o Valor da %dª Posição: ", (i + 1));
            valores[i] = sc.nextInt();

            somaPosicoes += (i + 1);

            somaElementos += valores[i];

            if ((valores[i] % 2) == 0) {
                somaPares += valores[i];
            }

            if (valores[i] > 6) {
                somaAcimaMedia += valores[i];
            }
        }

        sc.close();

        System.out.printf("Soma de Todos os Elementos: %d %n", somaElementos);
        System.out.printf("Soma dos Pares: %d %n", somaPares);
        System.out.printf("Soma das Posições: %d %n", somaPosicoes);
        System.out.printf("Soma dos Acima da Média: %d %n", somaAcimaMedia);

    }

}