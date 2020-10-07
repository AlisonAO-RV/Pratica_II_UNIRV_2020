/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 05 - Matriz
* EXERCICIO 01
*/

import java.util.Random;

public class L05_Ex01 {

    public static void main(String[] args) {

        Random rand = new Random();

        float matrizAlunos[][] = new float[10][3];
        float menorNota = 0;
        int Nunprova = 0;
        int contProva1 = 0;
        int contProva2 = 0;
        int contProva3 = 0;

        System.out.printf("%n%n|  ALUNOS  | PROVA  01 | PROVA  02 | PROVA  03 |%n");

        for (int i = 0; i < matrizAlunos.length; i++) {

            System.out.printf("| Aluno %2d ", i + 1);

            for (int j = 0; j < matrizAlunos[i].length; j++) {

                matrizAlunos[i][j] = rand.nextInt(10) + 1;
                System.out.printf("|   %5.2f   ", matrizAlunos[i][j]);

            }

            System.out.printf("|%n");
        }

        System.out.printf("%n|-RELATÓRIO MENOR NOTA -------->%n%n");

        for (int i = 0; i < matrizAlunos.length; i++) {

            menorNota = matrizAlunos[i][0];
            Nunprova = 0;

            for (int j = 0; j < matrizAlunos[i].length; j++) {
                
                if (menorNota >= matrizAlunos[i][j]) {
                    menorNota = matrizAlunos[i][j];
                    Nunprova = j;
                }
            }

            switch (Nunprova) {
                case 0:
                    contProva1++;
                    break;
                case 1:
                    contProva2++;
                    break;
                case 2:
                    contProva3++;
                    break;
            }

            System.out.printf("|-- Aluno %2d Menor nota: %5.2f na prova %d %n", i + 1, menorNota, Nunprova + 1);
        }

        System.out.printf("%n|-RELATÓRIO MENOR PROVA ------->%n%n");

        System.out.printf("|-- %d Alunos tiveram as menores nota na PROVA 01%n", contProva1);
        System.out.printf("|-- %d Alunos tiveram as menores nota na PROVA 02%n", contProva2);
        System.out.printf("|-- %d Alunos tiveram as menores nota na PROVA 03%n", contProva3);

        System.out.printf("%n");

    }

}
