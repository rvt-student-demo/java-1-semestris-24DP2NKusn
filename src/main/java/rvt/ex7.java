package rvt;

import java.util.Scanner;

public class ex7 {
    public static void ex7_19() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int len = word.length();
        for (int index = 0; index < len; index++) {
            System.out.println(word.charAt(index));
        }
        scanner.close();
    }

}
