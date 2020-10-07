/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 08 B
*/

import java.util.Scanner;

public class exercicio_08_B {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int valorA = 0;
    int valorB = 0;
    int valorC = 0;
    int valorD = 0;

    int sequencia01 = 0;
    int sequencia02 = 0;
    int sequencia03 = 0;
    int sequencia04 = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println("---- GRUPO " + (i + 1) + " ----");

      System.out.print("Digite o Valor A do Grupo " + (i + 1) + ": ");
      valorA = sc.nextInt();

      System.out.print("Digite o Valor B do Grupo " + (i + 1) + ": ");
      valorB = sc.nextInt();

      System.out.print("Digite o Valor C do Grupo " + (i + 1) + ": ");
      valorC = sc.nextInt();

      System.out.print("Digite o Valor D do Grupo " + (i + 1) + ": ");
      valorD = sc.nextInt();

      if ((valorA >= valorB) && (valorA >= valorC) && (valorA >= valorD)) {

        if ((valorB >= valorC) && (valorB >= valorD)) {
          if (valorC >= valorD) {
            sequencia01 = valorD;
            sequencia02 = valorC;
            sequencia03 = valorB;
            sequencia04 = valorA;
          } else {
            sequencia01 = valorC;
            sequencia02 = valorD;
            sequencia03 = valorB;
            sequencia04 = valorA;
          }
        } else if ((valorC >= valorB) && (valorC >= valorD)) {
          if (valorB >= valorD) {
            sequencia01 = valorD;
            sequencia02 = valorB;
            sequencia03 = valorC;
            sequencia04 = valorA;
          } else {
            sequencia01 = valorB;
            sequencia02 = valorD;
            sequencia03 = valorC;
            sequencia04 = valorA;
          }
        } else if ((valorD >= valorB) && (valorD >= valorC)) {
          if (valorB >= valorC) {
            sequencia01 = valorC;
            sequencia02 = valorB;
            sequencia03 = valorD;
            sequencia04 = valorA;
          } else {
            sequencia01 = valorB;
            sequencia02 = valorC;
            sequencia03 = valorD;
            sequencia04 = valorA;
          }
        }

      } else if ((valorB >= valorA) && (valorB >= valorC) && (valorB >= valorD)) {

        if ((valorA >= valorC) && (valorA >= valorD)) {
          if (valorC >= valorD) {
            sequencia01 = valorD;
            sequencia02 = valorC;
            sequencia03 = valorA;
            sequencia04 = valorB;
          } else {
            sequencia01 = valorC;
            sequencia02 = valorD;
            sequencia03 = valorA;
            sequencia04 = valorB;
          }
        } else if ((valorC >= valorA) && (valorC >= valorD)) {
          if (valorA >= valorD) {
            sequencia01 = valorD;
            sequencia02 = valorA;
            sequencia03 = valorC;
            sequencia04 = valorB;
          } else {
            sequencia01 = valorA;
            sequencia02 = valorD;
            sequencia03 = valorC;
            sequencia04 = valorB;
          }
        } else if ((valorD >= valorA) && (valorD >= valorC)) {
          if (valorA >= valorC) {
            sequencia01 = valorC;
            sequencia02 = valorA;
            sequencia03 = valorD;
            sequencia04 = valorB;
          } else {
            sequencia01 = valorA;
            sequencia02 = valorC;
            sequencia03 = valorD;
            sequencia04 = valorB;
          }
        }

      } else if ((valorC >= valorA) && (valorC >= valorB) && (valorC >= valorD)) {

        if ((valorA >= valorB) && (valorA >= valorD)) {
          if (valorB >= valorD) {
            sequencia01 = valorD;
            sequencia02 = valorB;
            sequencia03 = valorA;
            sequencia04 = valorC;
          } else {
            sequencia01 = valorB;
            sequencia02 = valorD;
            sequencia03 = valorA;
            sequencia04 = valorC;
          }
        } else if ((valorB >= valorA) && (valorB >= valorD)) {
          if (valorA >= valorD) {
            sequencia01 = valorD;
            sequencia02 = valorA;
            sequencia03 = valorB;
            sequencia04 = valorC;
          } else {
            sequencia01 = valorA;
            sequencia02 = valorD;
            sequencia03 = valorB;
            sequencia04 = valorC;
          }
        } else if ((valorD >= valorA) && (valorD >= valorB)) {
          if (valorA >= valorB) {
            sequencia01 = valorB;
            sequencia02 = valorA;
            sequencia03 = valorD;
            sequencia04 = valorC;
          } else {
            sequencia01 = valorA;
            sequencia02 = valorB;
            sequencia03 = valorD;
            sequencia04 = valorC;
          }
        }

      } else if ((valorD >= valorA) && (valorD >= valorB) && (valorD >= valorC)) {

        if ((valorA >= valorB) && (valorA >= valorC)) {
          if (valorB >= valorC) {
            sequencia01 = valorC;
            sequencia02 = valorB;
            sequencia03 = valorA;
            sequencia04 = valorD;
          } else {
            sequencia01 = valorB;
            sequencia02 = valorC;
            sequencia03 = valorA;
            sequencia04 = valorD;
          }
        } else if ((valorB >= valorA) && (valorB >= valorC)) {
          if (valorA >= valorC) {
            sequencia01 = valorC;
            sequencia02 = valorA;
            sequencia03 = valorB;
            sequencia04 = valorD;
          } else {
            sequencia01 = valorA;
            sequencia02 = valorC;
            sequencia03 = valorB;
            sequencia04 = valorD;
          }
        } else if ((valorC >= valorA) && (valorC >= valorB)) {
          if (valorA >= valorB) {
            sequencia01 = valorB;
            sequencia02 = valorA;
            sequencia03 = valorC;
            sequencia04 = valorD;
          } else {
            sequencia01 = valorA;
            sequencia02 = valorB;
            sequencia03 = valorC;
            sequencia04 = valorD;
          }
        }
        
      }

      System.out.printf("ORIGINAL:    - %s - %s - %s - %s%n", valorA, valorB, valorC, valorD);
      System.out.printf("CRESCENTE:   - %s - %s - %s - %s%n", sequencia01, sequencia02, sequencia03, sequencia04);
      System.out.printf("DECRESCENTE: - %s - %s - %s - %s%n%n", sequencia04, sequencia03, sequencia02, sequencia01);

    }

    sc.close();

  }
}