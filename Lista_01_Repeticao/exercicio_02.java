/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 02
*/

import java.util.Scanner;

public class exercicio_02 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int valorAtual = 0;
    int valorAntigo = 0;

    int rasaoAtual = 0;
    int rasaoAntiga = 0;

    boolean resultado = true;

    System.out.println("--- PROGREÇÃO  ARITIMÉTICA ---");
    System.out.println("-- VERIFICAÇÃO DE SEQUEICIA --");

    for (int i = 0; i < 9; i++) {
      System.out.print("Digite o a" + (i + 1) + ": ");
      
      valorAntigo = valorAtual;
      valorAtual = sc.nextInt();

      rasaoAntiga = rasaoAtual;
      rasaoAtual = valorAtual - valorAntigo;

      if (rasaoAtual != rasaoAntiga && resultado == true && i > 1) {
        resultado = false;
      }
    }

    sc.close();

    if (resultado == true) {
      System.out.println("A Sequencia é uma PA.");
    } else {
      System.out.println("A Sequencia Não é uma PA.");
    }
  }

}