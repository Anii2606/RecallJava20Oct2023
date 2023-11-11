package Loops;

public class Star12 {

  public static void main(String[] args) {
    /*

     * * * * * * 
      * * * * *  
       * * * *   
        * * *    
         * *     
          *
     */
    int n = 7;
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = n - 1; j > i; j--) {
        System.out.print("*" + " ");
      }

      System.out.println();
    }
    for (int k = 1; k <= n - 1; k++) {
      for (int i = n - 1; i > k; i--) {
        System.out.print(" ");
      }
      for (int i = 1; i <= k; i++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }
}
