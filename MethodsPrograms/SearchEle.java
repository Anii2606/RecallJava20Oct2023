// Write a method that checks if a given integer is present in an array and returns a boolean result
import java.util.Scanner;

public class SearchEle {

  public static void main(String[] args) {
    SearchEle.input();
  }

  static Scanner sc = new Scanner(System.in);

  static void input() {
    System.out.println("Enter Size ");
    int size = sc.nextInt();

    int[] a = new int[size];
    System.out.println("Enter Element ");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    SearchEle se = new SearchEle();
    se.search(a);
    boolean t = se.output(true);
    System.out.println(t);
  }

  int count = 0;

  int search(int[] b) {
    System.out.println("Enter Search Element ");
    int sear = sc.nextInt();
    for (int i = 0; i < b.length; i++) {
      if (sear == b[i]) {
        count++;
        System.out.println(b[i] + " is Avalible of index : " + i);
      }
    }
    return count;
  }

  boolean output(boolean t) {
    if (count == 0) {
      t = false;
      System.out.println("Not Avalible");
    } else {
      t = true;
    }
    return t;
  }
}
