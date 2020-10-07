/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
*
* Prova 17/09/2020
*
* Faça um programa para corrigir provas de múltipla escolha.
* Cada prova tem oito questões e cada questão vale um ponto.
* O primeiro conjunto de dados a ser lido é o gabarito da prova.
* Os outros dados são os números dos alunos e as respostas que deram às questões.
* Existem dez alunos matriculados.
* Calcule e mostre:
* ■ o número e a nota de cada aluno;
* ■ a porcentagem de aprovação, sabendo-se que a nota mínima é 6.
*/

import java.util.Scanner;

public class prova_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char gabarito[] = new char[8];
        char resposta[] = new char[8];
        int numeroAluno = 10;
        int idAluno = 0;
        double nota = 0;
        int alunos[] = new int[10];
        double notas[] = new double[10];
        int porcentagem = 0;
        double valorPorcentagem = 0;

        System.out.println("| GABARITO DA PROVA |");

        for (int i = 0; i < gabarito.length; i++) {

            System.out.printf("informe o %d° valor do gabarito: ", i + 1);
            gabarito[i] = sc.next().charAt(0);

        }

        System.out.println("");

        for (int i = 0; i < numeroAluno; i++) {

            System.out.printf("informe o Numero do Aluno: ");
            idAluno = sc.nextInt();

            System.out.printf("informe o resultado do gabarito do Aluno: %d\n", idAluno);

            for (int j = 0; j < resposta.length; j++) {

                System.out.printf("informe o %d° valor: ", j + 1);
                resposta[j] = sc.next().charAt(0);

            }

            System.out.println("");

            for (int k = 0; k < gabarito.length; k++) {

                if (gabarito[k] == resposta[k])
                    nota++;

            }

            alunos[i] = idAluno;
            notas[i] = nota;

            nota = 0;

        }

        sc.close();

        for (int i = 0; i < numeroAluno; i++) {

            System.out.printf("O Aluno %d tem a nota %2.0f\n", alunos[i], notas[i]);

            if (notas[i] >= 6) {

                porcentagem++;
            }

        }

        valorPorcentagem = (100 / numeroAluno) * porcentagem;

        System.out.printf("A porcentagem de aprovação é de %2.0f%%", valorPorcentagem);
        System.out.println("");
    }
}
