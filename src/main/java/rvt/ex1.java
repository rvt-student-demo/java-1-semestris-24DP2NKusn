package rvt;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Ievadiet skaitļus:");
        Scanner scanner = new Scanner(System.in);

        int sakums = scanner.nextInt();
        int beigums = scanner.nextInt();

        while (sakums <= beigums) {
            System.out.println(sakums);
            sakums += 1;
        }

        scanner.close();
    }

}
