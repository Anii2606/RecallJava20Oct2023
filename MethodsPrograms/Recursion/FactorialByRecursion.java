package Recursion;

import java.util.Scanner;

public class FactorialByRecursion {

  int fact(int num) {
    if (num == 0) {
      return 1;
    }
    return num * fact(num - 1);
  }

  void input() {
    Scanner sr = new Scanner(System.in);
    System.out.println("Enter number for Factorial");
    int n = sr.nextInt();
    int a = fact(n);
    System.out.println(n + " Factrial is " + a);
  }

  public static void main(String[] args) {
    FactorialByRecursion fr = new FactorialByRecursion();
    fr.input();
  }
}
