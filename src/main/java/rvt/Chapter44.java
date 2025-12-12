package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String args[]) {

    }
    public static void ex1() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String UserName = input.nextLine();
        String PirmsName = UserName.trim();

        int space = PirmsName.indexOf(" ");

        String Sur = PirmsName.substring(space);
        String Surname = Sur.toUpperCase();
        String Name = PirmsName.substring(0, space);

        System.out.println(Name + Surname);
    }

    public static void ex2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String UserString = input.nextLine();

        for (int i = 0; i < UserString.length(); i++) {
            System.out.println(UserString.charAt(i));
        }
    }
    public static void ex3() {}
    public static void ex4() {}
    public static void ex5() {}
    public static void ex6() {}
    public static void ex7() {}

}
