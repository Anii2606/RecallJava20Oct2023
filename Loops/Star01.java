/*
 
    *
   **
  ***
 ****
*****

 */
package Loops;

import java.util.Scanner;

public class Star01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number for row");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
////////////////////////////////////
/*
* * * * * * 
 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * * 

     */
/*
    for (int i = 1; i < 2 * n; i++) {
      int rowAndColumn;
      if (i > n) {
        rowAndColumn = 2 * n - i;
      } else {
        rowAndColumn = i;
      }
      for (int j = rowAndColumn; j > 1; j--) {
        System.out.print(" ");
      }
      for (int k = n; k >= rowAndColumn; k--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  */
