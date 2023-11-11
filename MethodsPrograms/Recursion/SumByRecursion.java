package Recursion;

import java.util.Scanner;

public class SumByRecursion {

  int sum(int total) {
    if (total != 0) {
      return total + sum(total - 1);
    }
    return 0;
  }

  void input() {
    Scanner sr = new Scanner(System.in);
    System.out.println("Enter number ");
    int n = sr.nextInt();
    int a = sum(n);
    System.out.println(n + " Sum is  : " + a);
  }

  public static void main(String[] args) {
    SumByRecursion sr = new SumByRecursion();
    sr.input();
  }
}
