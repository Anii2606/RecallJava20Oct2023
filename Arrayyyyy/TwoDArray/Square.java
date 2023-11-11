package TwoDArray;

import java.util.Scanner;

public class Square {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Size And Element For First Matrix");
    System.out.println("Enter Row Size ");
    int row = inp.nextInt();
    int[][] arr = new int[row][];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Row of " + i + "\nEnter Column Size");
      int colum = inp.nextInt();
      arr[i] = new int[colum];
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println(i + "," + j);
        arr[i][j] = inp.nextInt();
      }
    }
    System.out.println(
      "-------------------------------------------------------------"
    );

    for (int k = 0; k < arr.length; k++) {
      for (int k1 = 0; k1 < arr[k].length; k1++) {
        arr[k][k1] = arr[k][k1] * arr[k][k1];
      }
    }

    System.out.println("OUTPUT IS : ");
    System.out.println("arr\n");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");
  }
}
