/*
 
*                             *    
     *                   *
*         *         *         *
     *         *         *
*         *         *         *
     *                   *
*                             *
 */
package Loops;

public class Star15 {

  public static void main(String[] args) {
    System.out.println();
    int n = 9;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 7; j++) {
        if (
          i == j ||
          i + j == 8 ||
          i == 3 &&
          j == 1 ||
          i == 3 &&
          j == 7 ||
          i == 4 &&
          j == 2 ||
          i == 4 &&
          j == 6 ||
          i == 5 &&
          j == 1 ||
          i == 5 &&
          j == 7
        ) {
          System.out.print("*    ");
        } else {
          System.out.print("     ");
        }
      }
      System.out.println();
    }
    // }else{
    //     for (int j = 1; j <=i; j++) {
    System.out.println();
    //     }
  }
  //   } else {
  //     for (int j = 1; j <= i; j++) {
  //       if (j == 2 || j == 6) {
  //         System.out.print("*");
  //       } else {
  //         System.out.print(" ");
  //       }
  //     }

  // }
}
