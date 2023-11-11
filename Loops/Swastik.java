package Loops;

import java.util.Scanner;

public class Swastik {

  public static void main(String[] args) {
    Scanner swa = new Scanner(System.in);
    int n;
    int n2;
    System.out.print("How many Iteration do you want?  :");
    n = swa.nextInt();
    System.out.println("Enter Any Number (Row) For Swastik");
    n2 = swa.nextInt();

    System.out.println("\n");
    for (int s = 1; s <= n; s++) {
      if (s >= 2) {
        System.out.println("\n");
        n2 = n2 - 1;
      }

      int mid = n2 / 2;
      for (int i = 0; i <= n2; i++) {
        for (int j = 0; j <= n2; j++) {
          if (
            i == 0 &&
            j == 0 ||
            i == n2 &&
            j == n2 ||
            i == mid ||
            j == mid ||
            mid <= j &&
            i == 0 ||
            mid >= j &&
            i == n2 ||
            i <= mid &&
            j == 0 ||
            i >= mid &&
            j == n2
          ) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }
}
