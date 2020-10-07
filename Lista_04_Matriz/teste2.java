import java.util.Scanner;

public class teste2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] a = new String[5];
        int[] b = new int[5];
        int maior = 0, menor = 0;
        int posicao = 0, posicao2 = 0;
        
        for (int i = 0; i < 3; i++) {

            System.out.println("Digite o nome do aluno: ");
            a[i] = sc.nextLine();

        }

        for (int i = 0; i < 3; i++) {

            System.out.printf("Informe as notas do aluno %s", a[i]);
            b[i] = sc.nextInt();

            if (i == 0) {
                maior = b[i];
                menor = b[i];
            }

            if (b[i] > maior) {
                maior = b[i];
                posicao = i;
            }

            if (b[i] < menor) {
                menor = b[i];
                posicao2 = i;
            }
        }

        sc.close();
        
        System.out.println("\n");

        System.out.println("********");
        System.out.println("o maior e ->  " + maior + ":" + posicao);
        System.out.println("********");
        System.out.println("\n");
        System.out.println("********");
        System.out.println("o menor e ->  " + menor + ":" + posicao2);
        System.out.println("********");

        System.out.printf("o Nome do maior e ->  %s\n", a[posicao] );
        System.out.printf("o Nome do menor e ->  %s\n", a[posicao2] );

    }
}