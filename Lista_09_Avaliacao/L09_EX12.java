/*
* Pratica de programação II - 2020/2
* Aluno: Alison Alain de Oliveira
* LISTA 09
* EXERCICIO 12
*/

public class L09_EX12 {

    public static void main(String[] args) {

        int K = 3;
        int n = 0;
        int VetA[] = { 45, 56, 12, 43, 95, 19, 8, 67 };
        int VetB[] = { 8, 12, 19, 43, 45, 56, 67, 95 };
        int VetC[] = { 95, 67, 56, 45, 43, 19, 12, 8 };
        int VetD[] = { 19, 12, 8, 45, 43, 56, 67, 95 };
        int VetAux[] = new int[8];
        int Cont1 = 0;
        int Cont2 = 0;

        for (int l = 1; l < 5; l++) {
            switch (l) {
                case 1:
                    VetAux = VetA;
                    break;
                case 2:
                    VetAux = VetB;
                    break;
                case 3:
                    VetAux = VetC;
                    break;
                case 4:
                    VetAux = VetD;
                    break;
            }

            System.out.printf("\n|\33[0;33m ORIGINAL \33[0m");
            for (int vet : VetAux) {
                System.out.printf("| %2d ", vet);
            }
            System.out.printf("|\n");

            n = VetAux.length;

            while (K < n) {
                K = K * 3 + 1;
            }

            K = K / 3;
            int c, j;

            while (K > 0) {
                for (int i = K; i < n; i++) {
                    c = VetAux[i];
                    j = i;
                    while (j >= K && VetAux[j - K] > c) {
                        VetAux[j] = VetAux[j - K];
                        j = j - K;
                        Cont1++;
                    }
                    VetAux[j] = c;
                    Cont2++;
                }
                K = K / 2;
            }
            System.out.printf("|\33[0;32m ORDENADO \33[0m");
            for (int vet : VetAux) {
                System.out.printf("| \33[0;32m%2d\33[0m ", vet);
            }
            System.out.printf("|\n");
            System.out.printf("|\33[0;36m Contador 01  \33[0m | %2d |\33[0m", Cont1);
            System.out.printf("\33[0;34m Contador 02 \33[0m | %2d |\n\n", Cont2);

        }

    }

}
