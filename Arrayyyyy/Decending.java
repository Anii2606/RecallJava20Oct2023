import java.util.Scanner;

public class Decending {

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
    System.out.print("Decending Order  - ");
    for (int i = 0; i < asc.length; i++) {
      for (int j = i + 1; j < asc.length - i; j++) {
        if (asc[i] < asc[j]) {
          temp = asc[j];
          asc[j] = asc[i];
          asc[i] = temp;
        }
      }
      System.out.print(asc[i] + " ");
    }
  }
}
