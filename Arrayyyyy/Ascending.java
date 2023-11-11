import java.util.Scanner;

public class Ascending {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size for Array : ");
    int n = sc.nextInt();
    int[] asc = new int[n];
    System.out.print("Enter " + n + " Elements : ");
    for (int i = 0; i < asc.length; i++) {
      asc[i] = sc.nextInt();
    }
    int temp = 0;
    for (int i = 0; i < asc.length; i++) {
      for (int j = i + 1; j < asc.length; j++) {
        if (asc[i] > asc[j]) {
          temp = asc[i];
          asc[i] = asc[j];
          asc[j] = temp;
        }
      }
      System.out.print("Ascending Order  -" + asc[i] + " ");
    }
  }
}
