import java.util.Scanner;

public class PriimeeNum {

  public static boolean isPrime(int n, int divisor) {
    if (n <= 1) {
      return true;
    }
    if (divisor == 1) {
      return true;
    }
    if (n % divisor == 0) {
      return false;
    }
    return isPrime(n, divisor - 1);
  }

  public static void main(String[] args) {
    int num;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number");
    num = s.nextInt(); // Replace with the number you want to check for primality
    if (isPrime(num, num - 1)) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
  }
}
