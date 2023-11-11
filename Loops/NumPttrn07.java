/*

01010
10101
01010
10101
01010
10101

 */
package Loops;

public class NumPttrn07 {

  public static void main(String[] args) {
    int count;
    //  int i1 = 0;
    for (int i = 0; i <= 5; i++) {
      if (i % 2 == 0) {
        count = 0;
        for (int k = 1; k <= 5; k++) {
          System.out.print(count + " ");
          if (count == 0) {
            count = 1;
          } else {
            count = 0;
          }
        }
        System.out.println();
      } else {
        count = 1;
        for (int j2 = 1; j2 <= 5; j2++) {
          System.out.print(count + " ");
          if (count == 0) {
            count = 1;
          } else {
            count = 0;
          }
        }
        System.out.println();
      }
    }
  }
}
