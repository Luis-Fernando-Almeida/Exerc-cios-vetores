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

        int cont = 0;
        for(int i=0; i<n; i++){
            if (array[i].getAge() < 16){
                cont ++;
            }
        }
        double percent = cont * 100.0 /n;
        System.out.printf("Pessoas com menos de 16 anos %.1f%%%n", percent);

        for(int i=0; i<n; i++){
            if (array[i].getAge() < 16){
                System.out.printf("%s\n", array[i].getName());
            }
        }

        sc.close();
    }
}
