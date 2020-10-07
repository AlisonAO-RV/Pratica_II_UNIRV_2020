/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 05
*/

import java.util.Scanner;

public class exercicio_05_teste {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int valor = 0;
    double soma = 0;

    System.out.println("Verificação de Número Perfeito");
    System.out.print("Digite um Numero: ");
    valor = sc.nextInt();
    sc.close();

    for (int i = 2; i <= valor; i++) {

      if ((valor % i) == 0) {
        System.out.println(valor / i);
        soma = soma + (valor / i);
      }

    }
    if (valor == soma) {

      System.out.println("É um Numero perferito");

    } else {

      System.out.println("Não é um Numero perferito");

    }
  }

}