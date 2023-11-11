package Recursion;

import java.util.Scanner;

public class PrimeNumerByRecursion {

  int count = 0;

  int findPrime(int num, int s, int e) {
    if (s != e) {
      if (num % s == 0) {
        count++;
        return count;
      }
      return findPrime(num, s + 1, e);
    }
    return count;
  }

  void input() {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int n = s.nextInt();
    int starting = 2;
    int ending = n - 1;
    int result = findPrime(n, starting, ending);
    if (result == 0) {
      System.out.println(n + " is a primeNumer");
    } else {
      System.out.println(n + " is Not PrimeNumber");
    }
  }

  public static void main(String[] args) {
    PrimeNumerByRecursion pnr = new PrimeNumerByRecursion();
    pnr.input();
  }
}
