package Loops;

import java.util.Scanner;

public class Star06 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number for row :");

    int n = sc.nextInt();
    /* 

    
     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *
     
     */
    for (int i = 1; i <= 2 * n; i++) {
      int rowAndColumn;
      if (i > n) {
        rowAndColumn = 2 * n - i;
      } else {
        rowAndColumn = i;
      }
      for (int j = n; j >= rowAndColumn; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= rowAndColumn * 2 - 1; j++) {
        if (j == 1 || j == rowAndColumn * 2 - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    /*
     
     *
    * *
   *   *
  *     *
 *********
  *     *
   *   *
    * *
     *
     
     */
    // for (int i = 1; i <= 2 * n; i++) {
    //   int rowAndColumn;
    //   if (i > n) {
    //     rowAndColumn = 2 * n - i;
    //   } else {
    //     rowAndColumn = i;
    //   }
    //   for (int j = n; j >= rowAndColumn; j--) {
    //     System.out.print(" ");
    //   }
    //   for (int j = 1; j <= rowAndColumn * 2 - 1; j++) {
    //     if (j == 1 || rowAndColumn == n || j == rowAndColumn * 2 - 1) {
    //       System.out.print("*");
    //     } else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }

    /*
    * * * * * 
     *     *
      *   *
       * *
        * 

     */

    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j < i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int j = 1; j <= n - i + 1; j++) {
    //     if (i == 1 || j == 1 || j == n - i + 1) {
    //       System.out.print("* ");
    //     } else {
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }

    /////////////////////////////////////////////////////////////////////////////////////////////

    //System.out.println("*");
    /*
 
    *
   * *
  *   *
 *     *
*********
*/

    // for (int i = 1; i <= n; i++) {
    //   for (int j = n; j >= i; j--) {
    //     System.out.print(" ");
    //   }
    //   for (int j = 1; j <= i * 2 - 1; j++) {
    //     if (j == 1 || i == n || j == i * 2 - 1) {
    //       System.out.print("*");
    //     } else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }
  }
}
