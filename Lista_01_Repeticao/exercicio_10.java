/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 10
*/

import java.util.Scanner;

public class exercicio_10 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int valorDigitado = 1;
    int valorMaior = 0;
    int valorMenor = 0;

    while (true) {

      System.out.print("Digite um Valor Inteiro e Positivo");
      valorDigitado = sc.nextInt();
      
      if (valorDigitado == 0) {
        break;
      } else if (valorDigitado < 0) {
        System.out.println("Valor Digitado Invalido");
      } else {

        if (valorDigitado > valorMaior) {
          valorMaior = valorDigitado;
        }
        
        if ((valorDigitado < valorMenor) || valorMenor == 0) {
          valorMenor = valorDigitado;
        }
        
      }

    }

    sc.close();

    System.out.println("Valor Maior: " + valorMaior);
    System.out.println("Valor Menor: " + valorMenor);

  }
  
}