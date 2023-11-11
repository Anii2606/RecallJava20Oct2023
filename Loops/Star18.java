package Loops;

import java.util.Scanner;

public class Star18 {

  public static void main(String[] args) {
    int n, i, j, n1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows");
    n = sc.nextInt();
    System.out.println("Itration");
    n1 = sc.nextInt();
    for (int k = 1; k <=n1; k++) {
        if
    }
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= 5; j++) {
        if (i == 1 && j >= 1 || i == n && j >= 1) {
          System.out.print("*");
        } else if (i == (n - 1) / 2 || i == (n + 3) / 2) {
          System.out.print("$");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
