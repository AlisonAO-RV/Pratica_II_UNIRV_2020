/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 01
*/

import java.util.Scanner;

public class L09_EX01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String Loja[] = new String[8];
        String Produto[] = new String[4];
        double precos[][] = new double[Loja.length][Produto.length];

        System.out.printf("\n\33[0;33mCadastro de Loja\33[0m\n");
        for (int i = 0; i < Loja.length; i++) {
            System.out.printf("Digite o Nome da Loja %d: ", i + 1);
            Loja[i] = sc.nextLine();
        }

        System.out.printf("\n\33[0;33mCadastro de Produto\33[0m\n");
        for (int i = 0; i < Produto.length; i++) {
            System.out.printf("Digite o Nome do Produto %d: ", i + 1);
            Produto[i] = sc.nextLine();
        }

        System.out.printf("\n\33[0;33mCadastro de Preços\33[0m\n");
        for (int i = 0; i < Loja.length; i++) {
            System.out.printf("Loja: \33[0;33m%s\33[0m\n", Loja[i]);
            for (int j = 0; j < Produto.length; j++) {
                System.out.printf("Digite o Preço do %s: R$", Produto[j]);
                precos[i][j] = sc.nextDouble();
            }
        }

        System.out.printf("\n\33[0;33mRelatório : até R$ 120,00\33[0m\n");
        for (int i = 0; i < Loja.length; i++) {
            for (int j = 0; j < Produto.length; j++) {
                if (precos[i][j] <= 120.00) {
                    System.out.printf("Loja: %-13s | Produto: %-10s | Preço: \33[0;33mR$ %.2f\33[0m\n", Loja[i], Produto[j], precos[i][j]);
                }
            }
        }

        sc.close();
    }
}
