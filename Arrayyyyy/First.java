import java.util.Scanner;

public class First {

  public static void main(String[] args) {
    // min();
    max();
  }

  static void max() {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    System.out.println("Enter 10 values");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();
    int tem = a[0];
    // System.out.println("Enter Values");
    for (int i = 0; i < a.length; i++) {
      if (tem < a[i]) {
        tem = a[i];
      }
    }
    System.out.println("Maximum is :" + tem);
  }

  static void min() {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    System.out.println("Enter 10 values");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();
    int tem = a[0];
    // System.out.println("Enter Values");
    for (int i = 0; i < a.length; i++) {
      if (tem > a[i]) {
        tem = a[i];
      }
    }
    System.out.println("Minimum is :" + tem);
  }
}
