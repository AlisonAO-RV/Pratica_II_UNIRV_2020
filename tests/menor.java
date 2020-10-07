// import java.util.Scanner;
import java.util.Random;

public class menor {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int valor[][] = new int[5][5];
        int linha = 1;
        int coluna = 3;
        int linhaMaior = 0;
        int linhaMenor = 0;
        int colunaMaior = 0;
        int colunaMenor = 0;

        // primeiro obtenha o input sem fazer mais nada
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {
                //valor[i][j]= sc.nextInt();
                valor[i][j] = rand.nextInt(20) + 1;
                System.out.printf("|%2d", valor[i][j]);
            }
            System.out.printf("|\n");
        }

        linhaMaior = valor[linha][0];
        linhaMenor = valor[linha][0];
        colunaMaior = valor[0][coluna];
        colunaMenor = valor[0][coluna];

        System.out.printf("|\n");

        // linha
        for (int i = 0; i < valor.length; i++) {
            if (valor[linha][i] > linhaMaior) {
                linhaMaior = valor[linha][i];
            }
            if (valor[linha][i] < linhaMenor) {
                linhaMenor = valor[linha][i];
            }
        }

        // coluna
        for (int j = 0; j < valor[3].length; j++) {
            if (valor[j][coluna] > colunaMaior) {
                colunaMaior = valor[j][coluna];
            }
            if (valor[j][coluna] < colunaMenor) {
                colunaMenor = valor[j][coluna];
            }

        }

        System.out.println("Linha 2 ");
        System.out.println("|Maior valor = " + linhaMaior);
        System.out.println("|Menor valor  = " + linhaMenor);
        System.out.printf("|\n");
        System.out.println("Coluna 4 ");
        System.out.println("|Maior valor = " + colunaMaior);
        System.out.println("|Menor valor  = " + colunaMenor);

    }
}