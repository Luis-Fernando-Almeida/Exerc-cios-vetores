package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] array = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
        }


        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += array[i];
        }

        double media = sum / array.length;

            System.out.print("VALORES = ");
        for (int i =0; i<n; i++){
            if (array[i] > 0){
                System.out.printf("%.1f ", array[i]);
            }
        }

        System.out.printf("\nSOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n ", media);

        sc.close();
    }
}
