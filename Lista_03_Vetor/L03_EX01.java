/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 01
*/

import java.util.Scanner;

public class L03_EX01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float valorProduto[] = new float[10];
        int quantidadeVendida[] = new int[10];
        float totalProduto = 0;
        float totalVenda = 0;
        final float salarioFuncionario = (float) 545.00;
        final float porcentagem = 5;
        float comicao = 0;
        String printRelatorio;

        System.out.println("\n\n\nCONTROLE DE VENDAS\n\n\n");

        for (int i = 0; i < valorProduto.length; i++) {
            System.out.printf("Digite a Quantidade do item %02d: ", (i + 1));
            quantidadeVendida[i] = sc.nextInt();

            System.out.printf("Digite o Valor Unitário do item %02d: ", (i + 1));
            valorProduto[i] = sc.nextFloat();

            System.out.println("");
        }

        sc.close();

        for (int i = 0; i < valorProduto.length; i++) {
            totalProduto = quantidadeVendida[i] * valorProduto[i];
            totalVenda += totalProduto;

            printRelatorio = "Produto %02d: Valor Unit: %.2f  -  Quant. Vendida: %d  - Total: %.2f%n";
            System.out.printf(printRelatorio, (i + 1), valorProduto[i], quantidadeVendida[i], totalProduto);
        }

        System.out.printf("%nTotal de Todas as Vendas: %.2f%n", totalVenda);
        comicao = ((totalVenda / 100) * porcentagem);
        System.out.printf("%nTotal de Comição: %.2f%n", comicao);
        System.out.printf("%nTotal que o Funcionario Recebera: %.2f%n", salarioFuncionario + comicao);

    }

}
