//import java.util.Scanner;

public class Reverse {

  public static void main(String[] args) {
    int[] a = new int[] { 1, 2, 3, 4, 5, 6, 1 };
    //Scanner sc = new Scanner(System.in);

    for (int j = a.length - 1; j > 0; j--) {
      System.out.print(a[j] + " ");
    }
  }
}
