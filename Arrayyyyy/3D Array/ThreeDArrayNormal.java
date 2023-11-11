import java.util.Scanner;

public class ThreeDArrayNormal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][][] arr = new int[2][2][2];
    System.out.println("Enter Elements");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
          System.out.println(i + "," + j + "," + k);
          arr[i][j][k] = sc.nextInt();
        }
      }
    }
    sc.close();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
          System.out.print(arr[i][j][k] + " ");
        }
      }
      System.out.println();
    }
  }
}
