/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 03
*/

import java.util.Scanner;

public class exercicio_03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int resultado0a25 = 0;
    int resultado26a50 = 0;
    int resultado51a75 = 0;
    int resultado76a100 = 0;
    int valor = 0;

    while (valor > -1) {
      System.out.print("Digite um Numero entre 0 e 100: ");
      valor = sc.nextInt();

      if (valor > -1) {
        if (valor < 26) {
          resultado0a25++;
        } else if (valor < 51) {
          resultado26a50++;
        } else if (valor < 76) {
          resultado51a75++;
        } else if (valor < 101) {
          resultado76a100++;
        } else if (valor > 100) {
          System.out.println("Número Invalido");
        }
      } else {
        System.out.println("MOSTRANDO RESULTADO");
      }
    }

    sc.close();

    System.out.println("Resultado de  0 a  25: " + resultado0a25);
    System.out.println("Resultado de 26 a  50: " + resultado26a50);
    System.out.println("Resultado de 51 a  75: " + resultado51a75);
    System.out.println("Resultado de 76 a 100: " + resultado76a100);

  }

}