/*

* * * * * 
*       * 
*       * 
*       * 
*       * 
* * * * * 


 */
package Loops;

import java.util.Scanner;

public class Star07 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number for row :");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i == 1 || i == n) {
        for (int j = 1; j <= n - 1; j++) {
          System.out.print("* ");
        }
        System.out.println();
      } else {
        System.out.print("* ");
        for (int j = 1; j <= n - 3; j++) {
          System.out.print("  ");
        }
        System.out.print("* ");
        System.out.println();
      }
    }
  }
}
