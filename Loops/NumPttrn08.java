/*
 
1 
0 1       
1 0 1     
0 1 0 1   
1 0 1 0 1 

 */
package Loops;

public class NumPttrn08 {

  public static void main(String[] args) {
    int count;
    for (int i = 0; i <= 4; i++) {
      if (i % 2 == 0) {
        count = 1;
        for (int j = 0; j <= i; j++) {
          System.out.print(count + " ");
          if (count == 1) {
            count = 0;
          } else {
            count = 1;
          }
        }
        //System.out.println();
      } else {
        count = 0;
        for (int j = 0; j <= i; j++) {
          System.out.print(count + " ");
          if (count == 0) {
            count = 1;
          } else {
            count = 0;
          }
        }
      }
      System.out.println();
    }
  }
}
