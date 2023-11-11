/*
 
1 2 3    
6 5 4    
7 8 9    
12 11 10 
13 14 15 

 */
package Loops;

public class NumPttrn05 {

  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; i <= 5; i++) {
      if (i % 2 != 0) {
        for (int j = 1; j <= 3; j++) {
          count++;
          System.out.print(count + " ");
        }

        System.out.println();
      } else {
        int count02 = count + 1;
        for (int j = count + 3; j >= count02; j--) {
          System.out.print(j + " ");
          count++;
        }
        System.out.println();
      }
    }
  }
}
