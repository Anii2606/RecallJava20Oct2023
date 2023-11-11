//  Define a method that calculates the square of a number and returns it.

import java.util.Scanner;

public class SquareAndQube {

  int calcul = 0;

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int in = sc.nextInt();
    System.out.print("Square is : ");
    calcul = calSquare(in);
    output(calcul);
    System.out.print("Qube   is : ");
    calcul = calQube(in);
    output(calcul);
  }

  int calSquare(int squ) {
    squ = squ * squ;
    return squ;
  }

  int calQube(int qube) {
    qube = qube * qube * qube;
    return qube;
  }

  int output(int out) {
    System.out.println(calcul);
    return out;
  }

  public static void main(String[] args) {
    SquareAndQube s = new SquareAndQube();
    s.input();
  }
}
