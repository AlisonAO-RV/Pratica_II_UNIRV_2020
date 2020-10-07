/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 01
*/

import java.util.Scanner;

public class exercicio_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int primeiroElementoPA = 0;
    int razaoPA = 0;
    int nDePA = 0;
    int valoresDeNPA = 0;

    int primeiroElementoPG = 0;
    int razaoPG = 0;
    int nDePG = 0;
    int valoresDeNPG = 0;

    System.out.println("--- PROGRESSÃO ARITIMÉTICA ---");

    System.out.print("Informe o Primeiro Elemento da PA: ");
    primeiroElementoPA = sc.nextInt();

    System.out.print("Informe a razão da PA: ");
    razaoPA = sc.nextInt();

    System.out.print("Informe a quantidade de N para ser visualizado: ");
    nDePA = sc.nextInt();

    System.out.println();

    System.out.println("--- Resultado de PA ---");

    System.out.println("a1 = " + primeiroElementoPA);

    valoresDeNPA = primeiroElementoPA;

    for (int i = 1; i < nDePA; i++) {
      valoresDeNPA = valoresDeNPA + razaoPA;
      System.out.println("a" + (i + 1) + " = " + valoresDeNPA);
    }

    System.out.println("\n");
    System.out.println("--- PROGRESSÃO GEOMÉTRICA ---");

    System.out.print("Informe o Primeiro Elemento da PG: ");
    primeiroElementoPG = sc.nextInt();

    System.out.print("Informe a razão da PG: ");
    razaoPG = sc.nextInt();

    System.out.print("Informe a quantidade de N para ser visualizado: ");
    nDePG = sc.nextInt();

    sc.close();

    System.out.println();

    System.out.println("--- Resultado de PG ---");

    System.out.println("a1 = " + primeiroElementoPG);

    valoresDeNPG = primeiroElementoPG;

    for (int i = 1; i < nDePG; i++) {
      valoresDeNPG = valoresDeNPG * razaoPG;
      System.out.println("a" + (i + 1) + " = " + valoresDeNPG);
    }

  }
}