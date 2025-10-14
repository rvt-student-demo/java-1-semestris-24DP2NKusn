package rvt;

import java.util.Scanner;

public class ex4 {
     public static void main(String[] args) {
        
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
}
