import java.util.Scanner;

public class TrionacciSeries {

  // void input() {
  //   Scanner t = new Scanner(System.in);
  //   System.out.println("Enter Range of Tribonacci");
  //   int num = t.nextInt();
  //   int n = 0;
  //   System.out.println(n);
  //   int n1 = 1;
  //   System.out.println(n1);
  //   int n3 = 0;
  //   n3 = n3 + n + n1;
  //   System.out.println();
  //   tribonacci(num,n3);
  // }

  // int tribonacci(int i,int j) {
  //   int temp;
  //   for (int i = 0; i <= w; i++) {
  //     System.out.println(x);
  //     x = x + y;
  //     x = y;
  //     y = x;
  //   }
  //   return 0;
  // }

  public static void main(String[] args) {
    TrionacciSeries tc = new TrionacciSeries();
    // tc.input();
    Scanner t = new Scanner(System.in);
    System.out.println("Enter Range of Tribonacci");
    int num = t.nextInt();
    int n = 0;
    System.out.println(n);
    int n1 = 1;
    System.out.println(n1);
    int n3 = 0;
    n3 = n3 + n + n1;
    for (int i = 0; i <= num; i++) {
      System.out.println(n3);
    }
  }
}
