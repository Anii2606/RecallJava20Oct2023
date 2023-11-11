import java.util.Scanner;

public class Tab02 {

  public static void main(String[] args) {
    int a;
    System.out.println("if you want any table give a number");
    Scanner ulc = new Scanner(System.in);
    a = ulc.nextInt();

    System.out.println("Table of " + a + " is :");
    for (int i = 1; i <= 10; i++) {
      System.out.println(a + "*" + i + "= " + a * i + "\t");
    }
  }
}
