/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 10
* EXERCICIO 01
*/

import java.util.Random;
import java.util.Scanner;

public class L10_EX01 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[100];
        int busca = 0;
        int continua = 0;
        boolean achou = false;
        boolean loop = true;

        for (int i = 0; i < vetor.length; i++)
            vetor[i] = rand.nextInt(30) + 1;

        System.out.printf("Busca Numérica Sequencial\n");
        while (loop) {

            System.out.printf("\nBuscar numero:");
            busca = sc.nextInt();

            for (int i = 0; i < vetor.length; i++) {
                if (busca == vetor[i]) {
                    System.out.printf("O Número %d foi Encontrado na Posição %d\n", busca, i + 1);
                    achou = true;
                }
            }
            if (achou == false) {
                System.out.printf("O Número %d Não foi Encontrado\n", busca);
            }

            achou = false;

            System.out.printf("\nDeseja Nova Busca: [ 0 ] NÃO  -  [ 1 ] SIM  -  :");
            continua = sc.nextInt();
            if (continua == 0) {
                loop = false;
            }

        }

        sc.close();

    }

}
