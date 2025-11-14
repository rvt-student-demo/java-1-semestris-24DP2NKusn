package rvt;

import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;
    private int odd;
    private int even;


    public  Statistics() {
       this.count = 0;
       this.sum = 0;
       this.odd = 0;
       this.even = 0;
    }

    public void addNumber(int number) {
        sum += number;
        count += 1;
        if (number % 2 == 0) {
            even += number;
        } else {
            odd += number;
        }
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return sum/count;
    }

    public int evenSum() {
        return even;
    }

    public int oddSum() {
        return odd;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Statistics statistics = new Statistics();

        while (true) {
            System.out.println("Ievadi skaitļis: (Lai pabeigt ievadiet -1)");
            int ievade = Integer.valueOf(input.nextLine());

            if (ievade == -1) {
                break;
            } else {
                statistics.addNumber(ievade);
            }
        }


        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.evenSum());
        System.out.println("Sum of odd numbers: " + statistics.oddSum());
    }
}

