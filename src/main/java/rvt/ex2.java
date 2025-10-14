package rvt;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
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
}
