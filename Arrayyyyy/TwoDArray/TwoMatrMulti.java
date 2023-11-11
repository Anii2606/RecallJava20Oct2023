package TwoDArray;

//import java.util.Scanner;

public class TwoMatrMulti {

  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
    int[][] arr1 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

    int[][] arr3 = new int[3][3];
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int j2 = 0; j2 < 3; j2++) {
          sum = sum + (arr[i][j2] * arr1[j2][j]);
        }
        arr3[i][j] = sum;
        sum = 0;
      }
    }
    for (int is[] : arr3) {
      for (int is2 : is) {
        System.out.print(is2 + " ");
      }
      System.out.println();
    }
    // Scanner inp = new Scanner(System.in);

    // System.out.println("Matrix");
    // System.out.println("Enter arr Row Size ");

    // int row = inp.nextInt();
    // int[][] arr = new int[row][];

    // System.out.println("Enter arr1 Row Size ");

    // int row1 = inp.nextInt();
    // int[][] arr1 = new int[row1][];

    // int i = 0, j = 0;

    // System.out.println("arr");

    // for (i = 0; i < arr.length; i++) {
    //   System.out.println("Row of " + i + "\nEnter arr Column Size");

    //   int colum = inp.nextInt();
    //   arr[i] = new int[colum];

    //   for (j = 0; j < arr[0].length; j++) {
    //     System.out.println(i + "," + j);
    //     arr[i][j] = inp.nextInt();
    //   }
    // }

    // System.out.println("arr1");

    // for (i = 0; i < arr1.length; i++) {
    //   System.out.println("Row of " + i + "\nEnter  arr1 Column Size");

    //   int colum = inp.nextInt();
    //   arr1[i] = new int[colum];

    //   for (j = 0; j < arr1[0].length; j++) {
    //     System.out.println(i + "," + j);
    //     arr1[i][j] = inp.nextInt();

    //     arr[i][j] += arr[i][j] * arr1[i][j];
    //   }
    // }

    // System.out.println(
    //   "-------------------------------------------------------------"
    // );
    // System.out.println("RESULT(MULTI) : ");

    // for (int i = 0; i < 3; i++) {
    //   for (int j = 0; j < 3; j++) {
    //     System.out.print(+arr3[i][j] + "  ");
    //   }
    //   System.out.println();
    // }

    // System.out.println("-----------------------------------");
    // inp.close();
  }
}
