package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i=0; i<array.length; i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
        }

        int pairs = 0;
        System.out.println("\nNúmeros pares:");
        for (int i=0; i<n ; i++){
            if (array[i] % 2 == 0){
                System.out.printf("%d ", array[i]);
            pairs++;
            }
        }
        System.out.printf("\nQuantidade de pares = %d\n", pairs);
        sc.close();
    }
}

