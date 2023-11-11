// 3. Define a method to check if a number is even or odd and return a boolean result.
import java.util.Scanner;

public class EveOdd {

  public static void main(String[] args) {
    EveOdd eo = new EveOdd();
    eo.input();
    System.out.println(eo.tf(eo.f));
  }

  int in;

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    in = sc.nextInt();
    process(in);
  }

  int process(int n) {
    in = n % 2;
    return in;
  }

  boolean f = false;

  boolean tf(boolean f1) {
    System.out.println("Even(True)");
    System.out.println("Odd(False)");
    if (in == 0) {
      f1 = true;
    }
    return f1;
  }
}
// public class EveOdd {
//   static int in;
//   static boolean f = false;
//   public static void main(String[] args) {
//     EveOdd.input();
//     System.out.println(tf(f));
//   }
//   static void input() {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter number");
//     in = sc.nextInt();
//     process(in);
//   }
//   static int process(int n) {
//     in = n % 2;
//     return in;
//   }
//   static boolean tf(boolean f1) {
//     System.out.println("Even(True)");
//     System.out.println("Odd(False)");
//     if (in == 0) {
//       f1 = true;
//     }
//     return f1;
//   }
// }
