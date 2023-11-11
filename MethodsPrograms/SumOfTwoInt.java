// Create a method that takes two integers as input and returns their sum.
import java.util.Scanner;

public class SumOfTwoInt {

  int c = 0;

  public static void main(String[] args) {
    SumOfTwoInt st = new SumOfTwoInt();
    st.scan();
    System.out.println("Sum is : " + st.c);
  }

  void scan() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two number");

    System.out.println("(1)");
    int n1 = sc.nextInt();

    System.out.println("(2)");
    int n2 = sc.nextInt();
    c = SumOfTwonum(n1, n2);
  }

  int SumOfTwonum(int a, int b) {
    return a + b;
  }
}
