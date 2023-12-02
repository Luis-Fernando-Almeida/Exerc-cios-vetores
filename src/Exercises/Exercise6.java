package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        int[] arrayC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i=0; i<n; i++){
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i<n; i++){
            arrayB[i] = sc.nextInt();
        }

        for (int i =0; i<n; i++){
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        System.out.println("Vetor resultante:");
        for (int i=0; i<arrayC.length; i++){
            System.out.println(arrayC[i]);
        }

        sc.close();
    }
}

