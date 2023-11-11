/*
 
4321
 321
  21
   1

 */
package Loops;

public class NumPttrn11 {

  public static void main(String[] args) {
    for (int i = 4; i >= 1; i--) {
      for (int j = 4; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
