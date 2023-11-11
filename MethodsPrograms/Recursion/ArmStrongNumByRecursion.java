package Recursion;

import java.util.Scanner;

public class ArmStrongNumByRecursion {

  int len = 0;

  int getLength(int num) {
    if (num != 0) {
      len++;
      return getLength(num / 10);
    }
    return len;
  }

  int mul = 1;
  int sum = 0;

  int armStrong(int num1, int leng, int leng2) {
    if (num1 != 0) {
      int remaider = num1 % 10;
      if (leng != 0) {
        mul = mul * remaider;

        return armStrong(num1, leng - 1, leng2);
      }
      sum = sum + mul;
      mul = 1;
      return armStrong(num1 / 10, leng2, leng2);
    }
    return sum;
  }

  void input() {
    Scanner sr = new Scanner(System.in);
    System.out.print("Enter Any Number : ");
    int number = sr.nextInt();
    int len = getLength(number);
    int summ = armStrong(number, len, len);
    if (summ == number) {
      System.out.println(number + " Is Palindrome");
    } else {
      System.out.println(number + " Is Not Palindrome");
    }
  }

  public static void main(String[] args) {
    ArmStrongNumByRecursion as = new ArmStrongNumByRecursion();
    as.input();
  }
}
