package TwoDArray;

import java.util.Scanner;

public class Search1 {

  public static void main(String[] args) {
    // fourth Ways
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Size : ");
    int row = sc.nextInt();

    int[][] arr = new int[row][]; //4

    for (int i = 0; i < row; i++) {
      System.out.println("Row number " + i + "\n" + "Enter Colomn");
      int column = sc.nextInt();
      arr[i] = new int[column];
      System.out.println("Enter Elements ");
      for (int j = 0; j < column; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("-------------------------------------------");
    System.out.println("Search Element ");
    int search = sc.nextInt();
    System.out.println("--------------------------------------------");
    int count = 0, i, j = 0;
    //System.out.println(arr.length);
    // System.out.print(" Enter Elements : ");
    for (i = 0; i < arr.length; i++) {
      for (j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == search) {
          System.out.println(arr[i][j] + " is Available on " + i + "," + j);
          count = 1;
        }
        // System.out.print(arr[i][j] + " ");
      }
    }
    if (count == 0) {
      System.out.println(arr[i][j] + " is Not Available in Array ");
    }
    // System.out.println();
    sc.close();
  }
}
