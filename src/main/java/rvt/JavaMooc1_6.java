package rvt;

import java.util.Scanner;

public class JavaMooc1_6 {
    public static void GradesAndPoints() {
        
        Scanner scanner = new Scanner(System.in);

        int point = Integer.valueOf(scanner.nextLine());

        if (point < 0) {
            System.out.println("impossible!");
        }
        else if (point >= 0 && point <= 49) {
            System.out.println("failed");
        }
        else if (point >= 50 && point <= 59) {
            System.out.println("1");
        }
        else if (point >= 60 && point <= 69) {
            System.out.println("2");
        }
        else if (point >= 70 && point <= 79) {
            System.out.println("3");
        }
        else if (point >= 80 && point <= 89) {
            System.out.println("4");
        }
        else if (point >= 90 && point <= 100) {
            System.out.println("5");
        }
        else if (point > 100) {
            System.out.println("incredible!");
        }
        scanner.close();
    }

    public static void GiftTax() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scanner.nextLine());

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value <= 25000) {
            double tax = (100 + (value - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (value <= 55000) {
            double tax = (1700 + (value - 25000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if (value <= 200000) {
            double tax = (4700 + (value - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (value <= 1000000) {
            double tax = (22100 + (value - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else {
            double tax = (142100 + (value - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
    }
}
