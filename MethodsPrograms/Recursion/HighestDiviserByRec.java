package Recursion;

import java.util.Scanner;

public class HighestDiviserByRec {

  void scan() {
    Scanner h = new Scanner(System.in);
    System.out.println("Enter two number" + ("\n" + "Num 01"));
    int num1 = h.nextInt();
    System.out.println("Num 02");
    int num2 = h.nextInt();
    int divi = 1;
    int divid = highestDiviser(num1, num2, divi);
    System.out.println("The Highest common divider is : " + divid);
  }

  int store = 1;

  int highestDiviser(int n1, int n2, int div) {
    if (n1 % div == 0 && n1 != div) {
      if (n2 % div == 0 && n2 != div) {
        store = store * div;
      }
    }

    // int highestDiviser(int n1, int n2) {
    //   if (n2 == 0) {
    //     return n1;
    //   }
    //   return highestDiviser(n2, n1 % n2);
    // }

    if (div != n1 && div != n2) {
      return highestDiviser(n1, n2, div = div + 1);
    }
    return store;
  }

  public static void main(String[] args) {
    HighestDiviserByRec hr = new HighestDiviserByRec();
    hr.scan();
  }
}
