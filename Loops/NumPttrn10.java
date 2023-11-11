/*
          1 
        2 1 2
      3 2 1 2 3 
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5

 */
package Loops;

import java.util.Scanner;

public class NumPttrn10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }

      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      for (int h = 2; h <= i; h++) {
        System.out.print(h + " ");
      }
      System.out.println();
    }
    // for (int i = 1; i <= n; i++) {
    //   for (int j = n; j >= i; j--) {
    //     System.out.print("  ");
    //   }

    //   for (int j = i; j >= 1; j--) {
    //     System.out.print(j + " ");
    //   }
    //   for (int h = 2; h <= i; h++) {
    //     System.out.print(h + " ");
    //   }
    //   System.out.println();
    // }
  }
}
