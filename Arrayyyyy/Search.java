import java.util.Scanner;

public class Search {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size");
    int n = sc.nextInt();
    int[] sear = new int[n];
    System.out.println("Enter " + n + " Element ");
    for (int i = 0; i < n; i++) {
      sear[i] = sc.nextInt();
    }
    int count = 0;
    System.out.println();
    System.out.println("Search Element ");
    int searr = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (sear[i] == searr) {
        System.out.println(searr + " is Available in Array of Index " + i);
        count = 1;
      }
    }
    if (count == 0) {
      System.out.println(searr + " is Not Available in Array");
    }
  }
}
