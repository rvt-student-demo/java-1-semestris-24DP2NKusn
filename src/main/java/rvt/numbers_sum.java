package rvt;

import java.util.Scanner;

public class numbers_sum {
        public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

            int sum = 0;
            int count = 0;

            while (true) {
                System.out.println("Give a number: ");
                int number = Integer.valueOf(input.nextLine());
                if (number == 0) {
                    break;
                }

                sum += number;
                count++;
            }

            System.out.println("Sum of numbers: " + sum);
            System.out.println("Number of numbers: " + count);
    }
}
