/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 06
*/

import java.util.Scanner;

public class exercicio_06 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int valor01 = 0;
    int valor02 = 0;
    int valor03 = 0;

    System.out.println("VERIFICAÇÃO DE VALORES");
    System.out.println("-------------------------------");

    while (true) {
      System.out.print("Digite o Valor 01: ");
      valor01 = sc.nextInt();
      System.out.print("Digite o Valor 02: ");
      valor02 = sc.nextInt();
      System.out.print("Digite o Valor 03: ");
      valor03 = sc.nextInt();
      if (valor01 < valor02 && valor02 < valor03) {
        System.out.println("Soma: " + (valor01 + valor02 + valor03));
        System.out.println("Produto: " + (valor01 * valor02 * valor03));
        System.out.println("Média: " + (valor01 + valor02 + valor03) / 3);
        System.out.println("-------------------------------");
      } else {
        break;
      }
    }

    sc.close();

    System.out.println("-------------------------------");

  }

}