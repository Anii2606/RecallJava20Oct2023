import java.util.Scanner;

public class Fibonnaci {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int tem = 0;
    int num;
    System.out.println("Enter any number");
    num = sc.nextInt();
    System.out.println("____________________________________________________");
    //System.out.println(a + "\n" + b);

    for (int i = 1; i <= num; i++) {
      System.out.println(a);
      tem = a + b;
      a = b;
      b = tem;
    }
  }
}
