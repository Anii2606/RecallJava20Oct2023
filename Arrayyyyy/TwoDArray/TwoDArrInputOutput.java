package TwoDArray;

import java.util.Scanner;

public class TwoDArrInputOutput {

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
    System.out.println("Size And Element For Second Matrix");
    System.out.println("Enter Row Size ");
    int row1 = inp.nextInt();
    int[][] arr1 = new int[row1][];
    for (int i = 0; i < arr1.length; i++) {
      System.out.println("Row of " + i + "\nEnter Column Size");
      int colum = inp.nextInt();
      arr1[i] = new int[colum];
      for (int j = 0; j < arr1[i].length; j++) {
        System.out.println(i + "," + j);
        arr1[i][j] = inp.nextInt();
      }
    }
    System.out.println(
      "------------------------------------------------------"
    );
    System.out.println("OUTPUT IS : ");
    System.out.println("arr\n");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");
    System.out.println("arr1\n");

    for (int k = 0; k < arr1.length; k++) {
      for (int k2 = 0; k2 < arr1[k].length; k2++) {
        System.out.print(arr1[k][k2] + " ");
      }
      System.out.println();
    }
  }
}
