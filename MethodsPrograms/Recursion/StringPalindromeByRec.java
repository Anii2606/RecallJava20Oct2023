package Recursion;

import java.util.Scanner;

public class StringPalindromeByRec {

  boolean stringpalindrome(String name1, int s, int e) { // naman
    if (s == e) {
      return true;
    }
    if (name1.charAt(s) != name1.charAt(e)) {
      return false;
    }
    if (s < e + 1) {
      return stringpalindrome(name1, s + 1, e - 1);
    }
    return true;
  }

  void input() {
    Scanner a = new Scanner(System.in);
    System.out.println(" Enter Name ");
    String name = a.next();
    int leng = name.length();
    boolean f = bo(name, 0, leng - 1);
    if (f) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }

  boolean bo(String n, int start, int end) {
    if (end + 1 == 0) {
      return true;
    }
    return stringpalindrome(n, start, end);
  }

  public static void main(String[] args) {
    StringPalindromeByRec ss = new StringPalindromeByRec();
    ss.input();
  }
}
