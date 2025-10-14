package rvt;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

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
}
