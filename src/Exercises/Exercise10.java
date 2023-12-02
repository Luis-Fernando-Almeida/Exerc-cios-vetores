package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");

        int n = sc.nextInt();
        double[] media = new double[n];
        String[] name = new String[n];
        double[] note1 = new double[n];
        double[] note2 = new double[n];

        for (int i = 0; i<n; i++) {
            System.out.printf("Digite o nome, a primeira e segunda nota do %dº aluno:\n", i + 1);
            sc.nextLine();
            name[i] = sc.nextLine();
            note1[i] = sc.nextDouble();
            note2[i] = sc.nextDouble();
            media[i] = (note1[i] + note2[i]) / 2;
        }

        System.out.println("Alunos aprovados:");

        for (int i=0; i<n; i++){
            if (media[i] >= 6.0){
                System.out.println(name[i]);
            }
        }
        sc.close();
    }
}
