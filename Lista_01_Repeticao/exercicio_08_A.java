/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 08 A
*/

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_08_A {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[][] grupos = new int[5][4];

    for (int i = 0; i < 5; i++) {
      System.out.println("---- GRUPO " + (i + 1) + " ----");

      for (int j = 0; j < 4; j++) {
        System.out.print("Digite o " + (j + 1) + "° Número do Grupo " + (i + 1) + ": ");
        grupos[i][j] = sc.nextInt();
      }

    }

    sc.close();

    for (int i = 0; i < 5; i++) {
      System.out.println("- GRUPO " + (i + 1));
      System.out.printf("ORIGINAL:    - %s - %s - %s - %s%n", grupos[i][0], grupos[i][1], grupos[i][2], grupos[i][3]);
      Arrays.sort(grupos[i]);
      System.out.printf("CRESCENTE:   - %s - %s - %s - %s%n", grupos[i][0], grupos[i][1], grupos[i][2], grupos[i][3]);
      System.out.printf("DECRESCENTE: - %s - %s - %s - %s%n%n", grupos[i][3], grupos[i][2], grupos[i][1], grupos[i][0]);
    }
    
  }
}