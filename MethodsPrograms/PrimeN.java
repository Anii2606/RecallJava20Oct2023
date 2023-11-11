//  Create a method that checks if a number is prime and returns a boolean value.
import java.util.Scanner;

public class PrimeN {

  static int num = 0;
  static boolean f = true;

  public static void main(String[] args) {
    PrimeN.input();
    PrimeN pn = new PrimeN();
    pn.process(num);
    boolean fff = pn.output(f);
    System.out.println(fff);
  }

  static void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    num = sc.nextInt();
    sc.close();
  }

  int process(int num) {
    for (int i = 2; i < num - 1; i++) {
      if (num % i == 0) {
        f = false;
      }
    }
    return num;
  }

  boolean output(boolean ff) {
    if (ff == true) {
      System.out.println("This is Prime Number ");
    } else {
      System.out.println("Not PrimeNumber");
    }
    return ff;
  }
  /////////////////////////////////////////////////////////////////////

  // First way

  // public class PrimeN {

  //   static int num = 0;
  //   static int count = 0;

  //   public static void main(String[] args) {
  //     PrimeN.input();
  //     PrimeN pn = new PrimeN();
  //     pn.process(num);
  //     pn.output(count);
  //   }

  //   static void input() {
  //     Scanner sc = new Scanner(System.in);
  //     System.out.println("Enter Number");
  //     num = sc.nextInt();
  //     sc.close();
  //   }

  //   int process(int num) {
  //     for (int i = 2; i < num - 1; i++) {
  //       if (num % i == 0) {
  //         count++;
  //       }
  //     }
  //     return count;
  //   }

  //   int output(int coun) {
  //     if (count == 0) {
  //       System.out.println("This is Prime Number ");
  //     } else {
  //       System.out.println("Not PrimeNumber");
  //     }
  //     return coun;
  //   }

  /////////////////////////////////////////////////////////////////
  // second way

  //public static void main(String[] args) {
  //     Scanner sc = new Scanner(System.in);
  //     System.out.println("Enter Number");
  //     int num = sc.nextInt();

  //     PrimeN.process(num);
  //     if (count == 0) {
  //       System.out.println("This is Prime Number ");
  //     } else {
  //       System.out.println("Not PrimeNumber");
  //     }
  //   }

  //   static int process(int num) {
  //     for (int i = 2; i < num - 1; i++) {
  //       if (num % i == 0) {
  //         count++;
  //       }
  //     }
  //     return count;
  //   }

}
