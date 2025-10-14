package rvt;

import java.util.Scanner;

public class ex6 {
  public static void main(String[] args) {
    System.out.println("Ievadiet pirmo vardu");
    System.out.println("Ievadiet otro vardu");
    Scanner scanner = new Scanner(System.in);

    String word1 = scanner.nextLine();
    String word2 = scanner.nextLine();
    int garums1 = word1.length();
    int garums2 = word2.length();

    int dots = 30 - garums1 - garums2;
    System.out.print(word1);
    while (dots > 0) {
      System.out.print(".");
      dots = dots - 1;
    }
    System.out.print(word2);
    scanner.close();
  }
}
