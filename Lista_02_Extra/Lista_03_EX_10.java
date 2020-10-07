/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 10
*/

import java.util.Scanner;

public class Lista_03_EX_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nAlunos = 0;
        int gabaritoG[] = new int[5];
        int respostaAluno[] = new int[5];
        int notaAluno = 0;
        int acertos = 0;
        int mediaAluno = 5;

        System.out.print("Digite quantos Alunos: ");
        nAlunos = sc.nextInt();

        System.out.println("DIgite o Gabarito");

        for (int i = 0; i < gabaritoG.length; i++) {

            System.out.printf("Resposta %02d/05: ", (i + 1));
            gabaritoG[i] = sc.nextInt();

        }

        for (int i = 0; i < nAlunos; i++) {

            System.out.printf("%nDigite Resposta do Aluno %02d%n%n", (i + 1));

            for (int j = 0; j < respostaAluno.length; j++) {

                System.out.printf("Resposta %02d/05: ", (j + 1));
                respostaAluno[j] = sc.nextInt();

            }

            for (int k = 0; k < respostaAluno.length; k++) {

                if (gabaritoG[k] == respostaAluno[k]) {

                    notaAluno += 2;
                    acertos++;

                }

            }

            System.out.printf("%nAluno acertou %d questões%n", acertos);

            if (notaAluno >= mediaAluno) {

                System.out.printf("Aluno Aprovado%n%n");

            } else {

                System.out.printf("Aluno Reprovado%n%n");

            }

            notaAluno = 0;
            acertos = 0;

        }

        sc.close();

    }

}