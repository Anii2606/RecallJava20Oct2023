package Recursion;

import java.util.Scanner;

public class PalindromeByRecursion {

  int a;
  int t = 0;

  int palindromenum(int palin) { // 121
    if (palin != 0) {
      a = palin % 10;
      t = a + t * 10;
      return palindromenum(palin / 10);
    }
    return t;
  }

  void input() {
    Scanner a = new Scanner(System.in);
    System.out.println(" Enter Integer ");
    int num = a.nextInt();
    int aa = palindromenum(num);
    if (num == aa) {
      System.out.println(aa+"  Is Palindrome");
    } else {
      System.out.println(aa+" Is Not palindrome");
    }
  }

  public static void main(String[] args) {
    PalindromeByRecursion p = new PalindromeByRecursion();
    p.input();
  }
}
