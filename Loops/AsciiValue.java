package Loops;

import java.util.Scanner;

public class AsciiValue {

  public static void main(String[] args) {
    char c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Alphbet");
    c = sc.next().charAt(0);
    int a = c;
    System.out.print(a);
  }
}
