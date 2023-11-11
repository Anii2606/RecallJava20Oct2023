package TwoDArray;

import java.util.Scanner;

public class Traversing {

  public static void main(String[] args) {
    // fourth Ways
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Size : ");
    int row = sc.nextInt();

    int[][] arr = new int[row][]; //4

    for (int i = 0; i < row; i++) {
      System.out.println("Row number " + i + "\n" + " Enter Colomn");
      int column = sc.nextInt();
      arr[i] = new int[column];
      for (int j = 0; j < column; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    //System.out.println(arr.length);
    // System.out.print(" Enter Elements : ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    // first Normal Way

    // int[][] arr = {
    //   { 12, 13, 14, 15, 16 },
    //   { 17, 18, 19, 20, 21 },
    //   { 22, 23, 24, 25 },
    // };
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = 0; j < arr[i].length; j++) {
    //     System.out.print(arr[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // Second Way
    // int[][] arr = new int[3][5];
    // arr[0][1] = 12;
    // arr[1][4] = 13;
    // arr[2][2] = 14;
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = 0; j < arr[i].length; j++) {
    //     System.out.print(arr[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // Third Way
    // int[][] arr = new int[3][5];
    // System.out.print(" Enter Elements : ");
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = 0; j < arr[i].length; j++) {
    //     arr[i][j] = sc.nextInt();
    //   }
    // }
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = 0; j < arr[i].length; j++) {
    //     System.out.print(arr[i][j] + " ");
    //   }
    //   System.out.println();
    // }
  }
}
