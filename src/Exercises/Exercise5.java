package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();
        }

        int biggestNumber = array[0];
        int position = 0;

        for (int i=0; i<n; i++){
            if (biggestNumber < array[i]) {
                biggestNumber = array[i];
                position = i;
            }
        }
        System.out.println("\nMaior Valor = " + biggestNumber);
        System.out.println("Posicão do maior valor = " + position);

        sc.close();
    }
}
