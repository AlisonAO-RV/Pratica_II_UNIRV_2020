/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 03 - Vetor
* EXERCICIO 03
*/

public class L03_EX03 {

    public static void main(String[] args) {

        int contador = 100;
        int contadorPrimos = 0;
        int contadorVetor = 0;
        int vetorPrimos[] = new int[10];

        while (contadorVetor < vetorPrimos.length) {

            contador++;

            for (int i = 2; (i < contador) && (contadorPrimos == 0); i++) {
                if (contador % i == 0) {
                    contadorPrimos++;
                }
            }

            if (contadorPrimos == 0) {
                vetorPrimos[contadorVetor] = contador;
                contadorVetor++;
            }

            contadorPrimos = 0;

        }

        System.out.println("\n| 10 PRIMEIROS NÚMEROS PRIMOS ACIMA DE 100");

        for (int i = 0; i < vetorPrimos.length; i++) {
            System.out.printf("| %d ", vetorPrimos[i]);
        }
        
        System.out.println("|\n");

    }

}
