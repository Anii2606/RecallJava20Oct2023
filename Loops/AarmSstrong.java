package Loops;

import java.util.Scanner;

public class AarmSstrong {

  public static void main(String[] args) {
    Scanner arm = new Scanner(System.in);
    System.out.print("Enter any Number :");
    int num;
    num = arm.nextInt();
    int num1 = num;
    int length = 0;
    int mul = 1;
    int sum = 0;

    while (num1 != 0) {
      length++;
      num1 = num1 / 10;
    }
    System.out.println(length);

    int num2 = num;
    //System.out.println(length);
    while (num2 != 0) {
      int num3 = num2 % 10;
      for (int i = 1; i <= length; i++) {
        mul = mul * num3;
      }

      sum = sum + mul;
      mul = 1;
      num2 = num2 / 10;
    }

    if (num == sum) {
      System.out.println(num + " is ArmStrong");
    } else {
      System.out.println(num + " is  not ArmStrong");
    }
  }
}
