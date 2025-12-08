package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String args[]) {

    }

    public static void ex1() {
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

    public static void ex2() {
    
        System.out.println("Ievadiet veselo skaitlu.");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int summ = 0;

        while (n > 0) {
            summ = summ + n;
            n = n - 1;
        }
        System.out.println(summ);

        scanner.close();
    }

    public static void ex3() {
        
        System.out.println("Ievadiet veselo skaitlu.");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int summ = 0;

        while (n > 0) {
            summ = summ + n*n;
            n = n - 1;
        }
        System.out.println(summ);

        scanner.close();
    }

    public static void ex4() {
        
        System.out.println("Ievadiet sakum und beig vertibu.");
        Scanner scanner = new Scanner(System.in);

        int sakums = scanner.nextInt();
        int ped = scanner.nextInt();
        int summ = 0;

        while (sakums < ped + 1) {
            summ = summ + sakums;
            sakums = sakums + 1;
        
        }
        System.out.println(summ);

        scanner.close();
    }

    public static void ex5() {

        System.out.println("Ievadiet vardu.");
        Scanner scanner = new Scanner(System.in);

        String vards = scanner.nextLine();
        int garums = vards.length();
        while (garums > 0) {
            System.out.println(vards);
            garums = garums - 1;
        }
        scanner.close();
    }

    public static void ex6() {
        System.out.println("Ievadiet pirmo vardu");
        System.out.println("Ievadiet otro vardu");
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        int garums1 = word1.length();
        int garums2 = word2.length();

        int dots = 30 - garums1 - garums2;
        System.out.print(word1);
        while (dots > 0) {
            System.out.print(".");
            dots = dots - 1;
        }
        System.out.print(word2);
        scanner.close();
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int len = word.length();
        for (int index = 0; index < len; index++) {
            System.out.println(word.charAt(index));
        }
        scanner.close();
    }
}
