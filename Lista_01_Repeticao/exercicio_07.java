/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 07
*/

import java.util.Scanner;

public class exercicio_07 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double valorDivida = 0;
    double valorDividaComJuro = 0;
    double valorDoJuro = 0;
    double valorDaParcela = 0;
    int porcentagemDoJuros = 5;

    System.out.print("Informe o Valor da Divida : R$");
    valorDivida = sc.nextDouble();
    sc.close();

    System.out.format("|%-8s|%n", "-".repeat(76)); // Barra Separadora Horizontal

    System.out.format("|%-14s|%-17s|%-24s|%-18s|%n",
                      " Valor Divida",
                      " Valor dos Juros",
                      " Quantidade de Parcelas",
                      " Valor da Parcela");
    
    System.out.format("|%-8s|%n", "-".repeat(76)); // Barra Separadora Horizontal

    System.out.format("| R$ %-10.2f| R$ %-13d|  %-22s| R$ %-14.2f|%n",
                      valorDivida,
                      0,
                      "1X",
                      valorDivida);

    System.out.format("|%-8s|%n", "-".repeat(76)); // Barra Separadora Horizontal

    for (int i = 3; i < 13; i = i + 3) {

      porcentagemDoJuros = porcentagemDoJuros + 5;
      valorDoJuro = ((valorDivida / 100) * porcentagemDoJuros);
      valorDividaComJuro = (valorDivida + valorDoJuro);
      valorDaParcela = (valorDividaComJuro / i);

      System.out.format("| R$ %-10.2f| R$ %-13.2f|  %-22s| R$ %-14.2f|%n",
                        valorDividaComJuro,
                        valorDoJuro,
                        (i + "X"),
                        valorDaParcela);
                        
      System.out.format("|%-8s|%n", "-".repeat(76)); // Barra Separadora Horizontal
    }

  }
  
}