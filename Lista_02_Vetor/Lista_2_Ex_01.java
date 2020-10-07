/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 02 - Vetor
* EXERCICIO 01
*/

import java.util.Scanner;

public class Lista_2_Ex_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float notas[] = new float[10];
        float mediaAluno = 0;

        System.out.println("| LEITURA DE NOTAS");

        for (int i = 0; i < notas.length; i++) {

            System.out.printf("| Digite a Nota da %dª Posição: ", (i + 1));
            notas[i] = sc.nextFloat();
            mediaAluno += notas[i];

        }
        sc.close();

        if (notas[6] == 6.0) {
            System.out.println("\n| A Nota da 7ª Posição é igual a 6.0");
        } else {
            System.out.println("\n| A Nota da 7ª Posição é diferente de 6.0");
        }

        if (notas[(notas.length - 1)] == 6.0) {
            System.out.println("\n| A Nota da " + notas.length + "ª Posição é igual a 6.0");
        } else {
            System.out.println("\n| A Nota da " + notas.length + "ª Posição é diferente de 6.0");
        }

        System.out.printf("%n| A Média das notas é: %.2f %n", (mediaAluno/notas.length));

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 6.0) {
                System.out.println("\n| Aluno da " + (i+1) + "ª Posição esta Acima da Média");
            }
        }

    }

}