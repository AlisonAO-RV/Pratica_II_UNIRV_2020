/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 03
*/

import java.util.Scanner;

public class Lista_03_EX_03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int vetorC[] = new int[50];
        int maiorValor = 0;
        int posicaoMaiorValor = 0;

        for (int i = 0; i < vetorC.length; i++) {

            System.out.printf("Digite o valor %d/50: ", (i + 1));
            vetorC[i] = sc.nextInt();

            if (vetorC[i] > maiorValor) {

                maiorValor = vetorC[i];
                posicaoMaiorValor = i + 1;
                
            }

        }

        sc.close();

        System.out.printf("%nO mair valor digitado é %d e esta na posição %d.%n", maiorValor, posicaoMaiorValor);

    }
}