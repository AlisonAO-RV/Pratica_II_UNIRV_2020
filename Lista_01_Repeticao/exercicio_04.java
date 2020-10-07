/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 01 - Revisão Laços
* EXERCICIO 04
*/

public class exercicio_04 {

  public static void main(String[] args) {

    double contador = 0;
    double resultado = 0;

    for (int i = 1; i < 100; i++) {

      if ((i % 2) == 1) {
        contador++;
        resultado = resultado + (i / contador);
      }

    }

    System.out.println("Resultado: " + resultado);

  }

}