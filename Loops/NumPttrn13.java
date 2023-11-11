package Loops;

import java.util.Scanner;

public class NumPttrn13 {

  /*
 
1 2 3 4 
 2 3 4
  3 4
   4
  3 4
 2 3 4
1 2 3 4

 */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i < 2 * n; i++) {
      int rowAndColumn;
      if (i >= n) { //n==5
        rowAndColumn = 2 * n - i;
      } else {
        rowAndColumn = i;
      }
      for (int j = 1; j < rowAndColumn; j++) {
        System.out.print(" ");
      }
      for (int j = rowAndColumn; j <= n; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    // for (int i = 1; i <= 4; i++) {
    //   for (int j = 1; j < i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int j = i; j <= 4; j++) {
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }

    // for (int i = 3; i >= 1; i--) {
    //   for (int j = 2; j <= i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int j = i; j <= 4; j++) {
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }
  }
}
