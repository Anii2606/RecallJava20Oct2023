import java.util.Scanner;

public class ThreeDArray {

  public static void main(String[] args) {
    //  By User
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size 01 For array");
    int size1 = sc.nextInt();
    int[][][] arr = new int[size1][][]; // size=2
    for (int i = 0; i < arr.length; i++) {
      System.out.println("enter coloums " + i);
      int size = sc.nextInt();
      arr[i] = new int[size][];
      //System.out.println("Enter colomn size for " + i);
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("Enter colomn " + i + "," + j);
        int size2 = sc.nextInt();
        arr[i][j] = new int[size2];
        System.out.println("Enter Element ");

        for (int k = 0; k < arr[i][j].length; k++) {
          System.out.println(i + "," + j + "," + k);
          arr[i][j][k] = sc.nextInt();
        }
      }
    }
    sc.close();
    for (int i = 0; i < arr.length; i++) {
      //System.out.println("Enter colomn size for " + i);
      for (int j = 0; j < arr[i].length; j++) {
        //  int size2 = sc.nextInt();
        // arr[i][j] = new int[size2];
        for (int k = 0; k < arr[i][j].length; k++) {
          System.out.print(arr[i][j][k] + " ");
        }
      }
      System.out.println();
    }
  }
}
