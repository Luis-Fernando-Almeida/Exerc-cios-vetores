package Exercises;

import Entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Person[] array = new Person[n];

        for (int i=0; i< array.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            array[i] = new Person(name, age, height);
        }

        double sum = 0.0;
        for (int i=0; i< array.length; i++){
            sum += array[i].getHeight();
        }

        double avg = sum / array.length;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        sc.close();
    }
}
