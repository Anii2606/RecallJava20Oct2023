// Write a method to calculate the area of a rectangle and return the result.

// import java.util.Scanner;

// public class Retangle {

//   public static void main(String[] args) {}

//   void input(int n) {
//     Scanner s = new Scanner(System.in);
//     System.out.println("Enter Length");
//     int length = s.nextInt();
//     System.out.println("Enter Width");
//     int Width = s.nextInt();
//   }

//   int calAreaOfRectangle(int inArea) {}
//}

import java.util.Scanner;

public class Retangle {

  //int c;
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("First");
    int a = s.nextInt();
    System.out.println("Second");
    int b = s.nextInt();
    Retangle r = new Retangle();
    int c = r.total(a, b);
    r.sum(c);
  }

  int total(int t, int t1) {
    return t + t1;
  }

  int sum(int cc) {
    System.out.println(cc);
    return 0;
  }
}
