package TwoDArray;

import java.util.Scanner;

public class SubstraTwoMetrix {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.println("Matrix");
    System.out.println("Enter arr Row Size ");

    int row = inp.nextInt();
    int[][] arr = new int[row][];

    System.out.println("Enter arr1 Row Size ");

    int row1 = inp.nextInt();
    int[][] arr1 = new int[row1][];

    int i = 0, j = 0;

    int colum = 0;
    System.out.println("arr");

    for (i = 0; i < arr.length; i++) {
      System.out.println("Row of " + i + "\nEnter arr Column Size");

      colum = inp.nextInt();
      arr[i] = new int[colum];

      for (j = 0; j < arr[i].length; j++) {
        System.out.println(i + "," + j);
        arr[i][j] = inp.nextInt();
      }
    }

    System.out.println("arr1");

    for (i = 0; i < arr1.length; i++) {
      System.out.println("Row of " + i + "\nEnter  arr1 Column Size");

      int colum1 = inp.nextInt();
      arr1[i] = new int[colum1];

      for (j = 0; j < arr1[i].length; j++) {
        System.out.println(i + "," + j);
        arr1[i][j] = inp.nextInt();

        arr[i][j] = arr[i][j] - arr1[i][j];
      }
    }

    System.out.println(
      "-------------------------------------------------------------"
    );
    System.out.println("RESULT(Subsraction) : ");

    for (i = 0; i < arr.length; i++) {
      for (j = 0; j < arr[i].length; j++) {
        System.out.print(+arr[i][j] + "  ");
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");
    inp.close();
  }
}
