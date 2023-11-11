/*
 
 * 
 *  *    
 *  *  * 
 *  *    
 *

 */
package Loops;

import java.util.Scanner;

public class Star10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print: ");
    int num = sc.nextInt(); //5
    for (int i = 1; i < 2 * num; i++) {
      int rowAndColumn;
      if (i >= num) {
        rowAndColumn = 2 * num - i;
      } else {
        rowAndColumn = i;
      }
      for (int j = 1; j <= rowAndColumn; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    // for (int i = 1; i <= num; i++) {
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print(" * ");
    //   }
    //   System.out.println();
    // }
    // for (int i = num - 1; i >= 1; i--) {
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print(" * ");
    //   }
    //   System.out.println();
    // }
  }
}
