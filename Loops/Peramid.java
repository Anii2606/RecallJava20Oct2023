/*
 
*       
**      
***     
****    
*****   
******  
******* 
********
      
********
******* 
******  
*****   
****    
***     
**      
*

 */
package Loops;

public class Peramid {

  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // System.out.println("\n");
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    for (int i = 9; i > 1; i--) {
      for (int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
