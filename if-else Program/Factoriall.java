import java.util.Scanner;

public class Factoriall {

  public static void main(String[] args) {
    int num;
    System.out.println("Enter any number");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    int fac = 1;
    for (int i = 1; i <= num; i++) {
      fac = fac * i;
    }
    System.out.println("Factorial :" + fac);
  }
}
