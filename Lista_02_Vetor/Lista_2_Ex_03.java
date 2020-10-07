/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 02 - Vetor
* EXERCICIO 03
*/

import java.util.Scanner;

public class Lista_2_Ex_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorN[] = new int[6];
        int maiorValor = 0;
        int posicaoMaiorValor = 0;
        int menorValor = 0;
        int posicaoMenorValor = 0;

        for (int i = 0; i < vetorN.length; i++) {

            System.out.printf("Digite a %d valor: ", (i + 1));
            vetorN[i] = sc.nextInt();

            if (vetorN[i] > maiorValor) {
                maiorValor = vetorN[i];
                posicaoMaiorValor = (i + 1);
            }

            if (vetorN[i] < menorValor || i == 0) {
                menorValor = vetorN[i];
                posicaoMenorValor = (i + 1);
            }

        }

        sc.close();
        
        System.out.printf("O maior valor do vetor é %d e está na %d posição%n", maiorValor, posicaoMaiorValor);
        System.out.printf("O menor valor do vetor é %d e está na %d posição%n", menorValor, posicaoMenorValor);

    }
}