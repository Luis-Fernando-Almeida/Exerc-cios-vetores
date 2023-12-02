package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] array = new double[n];
        double media = 0;

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextDouble();
        }

        for (int i=0; i<n; i++){
           media += array[i] / n;
        }

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("Elementos abaixo da média:");

        for (int i=0; i<n; i++){
            if (array[i] < media){
                System.out.printf("%.1f\n", array[i]);
            }
        }

        sc.close();
    }
}
