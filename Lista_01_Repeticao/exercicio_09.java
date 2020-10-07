/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 09
*/

import java.util.Scanner;

public class exercicio_09 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int opcao = 0;

    double nota1Aritimetica = 0;
    double nota2Aritimetica = 0;

    double nota1Ponderada = 0;
    double nota2Ponderada = 0;
    double nota3Ponderada = 0;

    double peso1Ponderada = 0;
    double peso2Ponderada = 0;
    double peso3Ponderada = 0;

    double pondera = 0;
    double peso = 0;

    int valido = 0;

    while (valido > -1) {
      System.out.println("---- MENU ----");
      System.out.println("1. MÉDIA ARITMÉTICA");
      System.out.println("2. MÉDIA PONDERADA");
      System.out.println("3. SAIR");
      System.out.println("DIGITE A OPÇÃO DESEJADA: ");
      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite a 1° Nota: ");
          nota1Aritimetica = sc.nextDouble();
          System.out.print("Digite a 2° Nota: ");
          nota2Aritimetica = sc.nextDouble();
          System.out.println("Média Aritimética: " + ((nota1Aritimetica + nota2Aritimetica) / 2));
          System.out.println();
          break;

        case 2:
          System.out.print("Digite a 1° Nota: ");
          nota1Ponderada = sc.nextDouble();
          System.out.print("Digite o 1° peso: ");
          peso1Ponderada = sc.nextDouble();

          System.out.print("Digite a 2° Nota: ");
          nota2Ponderada = sc.nextDouble();
          System.out.print("Digite o 2° peso: ");
          peso2Ponderada = sc.nextDouble();
          
          System.out.print("Digite a 3° Nota: ");
          nota3Ponderada = sc.nextDouble();
          System.out.print("Digite o 3° peso: ");
          peso3Ponderada = sc.nextDouble();

          pondera = (nota1Ponderada * peso1Ponderada) +
                    (nota2Ponderada * peso2Ponderada) +
                    (nota3Ponderada * peso3Ponderada);

          peso = peso1Ponderada + peso2Ponderada + peso3Ponderada;

          System.out.println("Média Ponderada: " + (pondera / peso));
          break;

        case 3:
          valido = -1;
          break;

        default:
          System.out.println("Comando Invalido");
          break;
      }

    }

    sc.close();

  }

}