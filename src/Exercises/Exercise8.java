package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int sumPairs = 0;
        int nPairs = 0;
        double mediaPairs = 0;

        int[] array = new int[n];


        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            if (array[i] % 2 == 0){
                sumPairs += array[i];
                nPairs++;
            }
        }
        if (nPairs == 0){
            System.out.println("Nenhum número par");
        } else {
            mediaPairs = (double)sumPairs/nPairs;
            System.out.printf("Media dos pares = %.1f\n", mediaPairs);
        }

        sc.close();
    }
}
