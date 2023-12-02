package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double[] height = new double[n];
        String[] gender = new String[n];
        double shortest = Double.MAX_VALUE; // Inicializa com o maior valor possível para double
        double media = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            height[i] = sc.nextDouble();

            // Limpeza do buffer
            sc.nextLine();

            System.out.printf("Gênero da %dª pessoa: ", i + 1);
            gender[i] = sc.nextLine();
        }

        // Encontrar a menor altura
        for (int i = 0; i < n; i++) {
            if (height[i] < shortest) {
                shortest = height[i];
            }
        }

        // Imprimir a menor altura
        System.out.println("Menor altura = " + shortest);

        sc.close();
    }
}
