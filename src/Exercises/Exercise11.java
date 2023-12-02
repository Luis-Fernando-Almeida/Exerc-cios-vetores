package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitas? ");
        int n = sc.nextInt();
        int qtdMen =0;
        int qtdWomen = 0;
        double totalHeightWomen = 0;
        double mediaHeightWomen = 0;

        double[] height = new double[n];
        char[] gender = new char[n];

        for (int i = 0; i<n; i++){
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            height[i] = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Gênero da %dª pessoa: ", i + 1);
            gender[i] = sc.next().charAt(0);
        }

        double shortest = height[0];
        double heighest = height[0];


        for (int i=0; i<n; i++) {
            if (height[i] < shortest) {
                shortest = height[i];
            }
            if (height[i] > heighest) {
                heighest = height[i];
            }
        }

        System.out.println("Número de homens:");
        for (int i=0; i<n; i++){
            if (gender[i] == 'm'){
                qtdMen++;
            }
            else{
                qtdWomen++;
                totalHeightWomen += height[i];
            }
        }
        mediaHeightWomen = totalHeightWomen / qtdWomen;

        System.out.printf("Menor altura = %.2f\n", shortest);
        System.out.printf("Maior altura = %.2f\n", heighest);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaHeightWomen);
        System.out.printf("Número de homens = %d\n", qtdMen);

        sc.close();
    }
}
