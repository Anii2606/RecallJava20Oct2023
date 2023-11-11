// Write a method that computes the factorial of a given integer and returns the result.

import java.util.Scanner;

public class Factorial {

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n1 = sc.nextInt();
    process(n1); // 4
  }

  int fact = 1;

  // By Recursion
  int process(int n2) { //4
    int n = 1;
    if (n2 >= n) { // 4>=1 , 3>=1 , 2>=1 ,1>=1
      fact = fact * n2; // fact=1*4= 4*3=12*2=24*1=24
      n2 = n2 - 1; // n2=3 ,n2=2 , n2=1 , n2=0
      process(n2);
    }
    return n2;
  }

  public static void main(String[] args) {
    Factorial fff = new Factorial();
    fff.input();
    System.out.println("Factorial is : " + fff.fact);
  }
}
