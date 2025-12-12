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
    public static void ex3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String UserName = input.nextLine();

        if (UserName.startsWith("Amy") ||  UserName.startsWith("Buffy") || UserName.startsWith("Cathy")){
            System.out.println("Ms." + UserName);
        } else if (UserName.startsWith("Elroy") ||  UserName.startsWith("Fred") || UserName.startsWith("Graham")) {
            System.out.println("Mr." + UserName);
        } else {
            System.out.println(UserName);
        }
    }
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cook time: ");
        String time = scanner.nextLine().trim();

        String minutes; 
        String seconds;

        if (time.length() <= 2) {
            minutes = "0";
            seconds = time;
        } else {
            minutes = time.substring(0, time.length() - 2);
            seconds = time.substring(time.length() - 2);
        }

        if (seconds.length() == 1) {
            seconds = "0" + seconds;
        }
        System.out.println("Your time-> " + minutes + ":" + seconds);
    }
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("//")) {
                System.out.println(line);
            }
        }
    }
    public static void ex6() {}
    public static void ex7() {}

}
