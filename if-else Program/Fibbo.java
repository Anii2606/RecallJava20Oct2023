import java.util.Scanner;

public class Fibbo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int tem = 0;
    int num;
    System.out.println("Enter any number");
    num = sc.nextInt();
    System.out.println("____________________________________________________");
    System.out.println(a + "\n" + b);

    for (int i = 0; i <= num; i++) {
      tem = a + b;
      a = b;
      b = tem;
      System.out.println(tem);
    }
  }
}
