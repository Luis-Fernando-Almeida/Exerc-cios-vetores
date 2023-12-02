package Exercises;

import Entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Person[] array = new Person[n];


        for (int i = 0; i<n; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome:");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            array[i] = new Person(name, age);
        }

        int oldestAge = 0;
        String oldestName = "";
        for (int i=0; i<n; i++){
            if (oldestAge < array[i].getAge()) {
                oldestAge = array[i].getAge();
                oldestName = array[i].getName();
            }
        }
        System.out.println("Pessoa mais velha: " + oldestName);
        sc.close();
    }
}
