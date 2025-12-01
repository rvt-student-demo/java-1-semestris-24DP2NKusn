package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String args[]) {
        ex3();
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
            Scanner input = new Scanner(System.in);
            System.out.println("Enter cook time: ");
            String Time = input.nextLine();
            

            int Minutes;
            int Seconds;

            if (2 <= Time.length()) {
                
            }
        }
        public static void ex5() {}
        public static void ex6() {}
        public static void ex7() {}

}
