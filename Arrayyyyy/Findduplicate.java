import java.util.Scanner;

public class Findduplicate {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Element");
    int[] dup = new int[5];

    for (int i = 0; i < dup.length; i++) {
      dup[i] = sc.nextInt(); // 34 23 23 34 23
    }
    int dup1 = dup[0];
    System.out.println("Duplicate Numbers is : ");
    for (int i = 0; i < dup.length; i++) {
      for (int j = 0; i < dup.length; i++) {
        if (dup[i] == dup[j]) {
          dup1 = dup[j];
        }
      }
      System.out.println(dup1);
    }
  }
}
