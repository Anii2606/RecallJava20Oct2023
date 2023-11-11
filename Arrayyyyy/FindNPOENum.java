/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s. */

import java.util.Scanner;

public class FindNPOENum {

  public static void main(String[] args) {
    Scanner pnoe = new Scanner(System.in);
    int n = 10;
    System.out.println("Enter " + n + " Element");
    int[] f = new int[n];
    for (int i = 0; i < f.length; i++) {
      f[i] = pnoe.nextInt();
    }
    System.out.println();
    for (int i = 0; i < f.length; i++) {
      if (f[i] > 0) {
        System.out.print(f[i] + " is positive number");
        if (f[i] % 2 == 0) {
          System.out.println(" End also even number");
        } else {
          System.out.println("End also odd number");
        }
        System.out.println("--------------------------------");
      } else if (f[i] < 0) {
        System.out.println(f[i] + " is Nagative number");
        if (f[i] % 2 == 0) {
          System.out.println("End also even number");
        } else {
          System.out.println("End also odd number");
        }
        System.out.println("");
      } else {
        System.out.println(f[i] + " is Zero");
      }
    }
  }
}
