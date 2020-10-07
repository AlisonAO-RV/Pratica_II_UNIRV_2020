
public class teste {

    public static void main(String[] args) {

        int n = 3;
        double nota1[] = new double[n];
        double nota2[] = new double[n];
        double nota3[] = new double[n];
        double nota4[] = new double[n];
        double notaFinal[] = new double[n];
        int i;

        for (i = 0; i < n; i++) {

            nota1[i] = (double) (1 + Math.random() * 10);
            nota2[i] = (double) (1 + Math.random() * 10);
            nota3[i] = (double) (1 + Math.random() * 10);
            nota4[i] = (double) (1 + Math.random() * 10);

            notaFinal[i] = ((nota1[i] * 5) + (nota2[i] * 2) + (nota3[i] * 2) + nota4[i]) / 10;
            
        }

        System.out.printf("\n|-------------------------------------------------------------------|");
        System.out.printf("\n| Aluno | 1a.Nota | 2a.Nota | 3a.Nota | 4a.Nota | Media | Situacao  |");
        System.out.printf("\n|-------------------------------------------------------------------|");

        for (i = 0; i < n; i++) {

            System.out.printf("\n| %5d | %7.2f | %7.2f | %7.2f | %7.2f | %5.2f | ", (i + 1), nota1[i], nota2[i], nota3[i], nota4[i], notaFinal[i]);


            if (notaFinal[i] >= 7.0) {

                System.out.printf("aprovado  |");

            } else {

                System.out.printf("reprovado |");

            }

            System.out.printf("\n|-------------------------------------------------------------------|");
        }       

    }
}