package Loops;

import java.util.Scanner;

public class Star17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Number for row");
    int n = sc.nextInt(); //7
    System.out.println("Enter Itration of code");
    int spac;
    for (int i = 1; i <= n; i++) {
      for (spac = 1; spac < n-spac; spac++) {
       System.out.print(" ");
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    // int n1 = sc.nextInt(); //7
    // int im = (n + 1) / 2; // 4
    // int jm = (n - 1) / 2; // 3
    // for (int itr = 1; itr <= n1; itr++) {
    //   for (int i = 1; i <= n; i++) {
    //     if (itr <= 1 && n <= 7) {
    //       for (int j = 1; j <= 5; j++) {
    //         if (
    //           jm != j &&
    //           im == i ||
    //           i == (n - 1) / 2 ||
    //           i == (n + 3) / 2 ||
    //           i == (n - 3) / 2 &&
    //           j == (n - 1) / 2 ||
    //           i == (n + 5) / 2 &&
    //           j == (n - 1) / 2
    //         ) { // j != 3 // i == 6 && // j == 3 || // i == 4 && // j != 3 || // i == 2 &&
    //           System.out.print("  ");
    //         } else {
    //           System.out.print("*" + " ");
    //         }
    //       }
    //       System.out.println();
    //     } else {
    //       for (int i1 = 1; i1 <= n; i1++) {
    //         for (int j = 1; j <= 5; j++) {
    //           if (
    //             jm != j &&
    //             im == i ||
    //             // i1 == 1 ||
    //             i1 ==
    //             (n - 1) /
    //             2 ||
    //             i1 == (n + 3) / 2 ||
    //             i1 == (n - 3) / 2 &&
    //             j == (n - 1) / 2 ||
    //             i1 == (n + 5) / 2 &&
    //             j == (n - 1) / 2
    //           ) { // j != 3 // i1 == 6 && // j == 3 || // i1 == 4 && // j != 3 || // i1 == 2 &&
    //             System.out.print("  ");
    //           } else {
    //             System.out.print("*" + " ");
    //           }
    //         }
    //         System.out.println();
    //       }
    //     }
    //   }
    // }
  }

