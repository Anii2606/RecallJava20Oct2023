/*

*
  *
*   *
  *   *
*   *   *
  *   *
*   *
  *
*


 */
package Loops;

import java.util.Scanner;

public class Star16 {

  public static void main(String[] args) {
    int row;
    System.out.println("Enter row for print");
    Scanner sc = new Scanner(System.in);
    row = sc.nextInt();

    //int mid = row / 2;
    String count = " ";
    for (int i = 1; i <= row; i++) {
      if (i % 2 != 0) {
        count = "*";
        for (int j = 1; j <= i; j++) {
          System.out.print(count + " ");
          if (count == "*") {
            count = " ";
          } else {
            count = "*";
          }
        }
        System.out.println();
      }
      // System.out.println(" ");

      else {
        count = " ";
        for (int j = 1; j <= i; j++) {
          System.out.print(count + " ");
          if (count == " ") {
            count = "*";
          } else {
            count = " ";
          }
        }
        System.out.println();
      }
    }

    ///////////////////////////////
    String count1 = "*";
    for (int i = 2; i <= row; i++) {
      if (i % 2 != 0) {
        count = " ";
        for (int j = i; j <= row; j++) {
          System.out.print(count + " ");
          if (count == " ") {
            count = "*";
          } else {
            count = " ";
          }
        }
        System.out.println();
      }
      // System.out.println(" ");

      else {
        count = "*";
        for (int j = i; j <= row; j++) {
          System.out.print(count + " ");
          if (count == "*") {
            count = " ";
          } else {
            count = "*";
          }
        }
        System.out.println();
      }
    }
  }
}
