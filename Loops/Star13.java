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
package Loops;

import java.util.Scanner;

public class Star13 {

  public static void main(String[] args) {
    int row;
    System.out.println("Enter row for print");
    Scanner sc = new Scanner(System.in);
    row = sc.nextInt(); //7
    for (int i = 0; i <= 2 * row; i++) {
      int rowAndColumn = i >= row ? 2 * row - i : i;
      for (int j = row; j >= rowAndColumn; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  // for (int i = 1; i <= row; i++) {
  //   for (int j = row; j >= i; j--) {
  //     System.out.print("* ");
  //   }
  //   System.out.println();
  // }
  // for (int i = 1; i <= row; i++) {
  //   for (int j = 1; j <= i; j++) {
  //     System.out.print("* ");
  //   }
  //   System.out.println();
  // }
}
