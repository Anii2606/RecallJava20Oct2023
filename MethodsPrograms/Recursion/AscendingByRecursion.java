package Recursion;

import java.util.Scanner;

public class AscendingByRecursion {

  Scanner sc = new Scanner(System.in);
  // length common for All methods
  int len;

  public static void main(String[] args) {
    System.out.println("Enter Array Size ");
    // create a object for instance calling class level
    AscendingByRecursion t = new AscendingByRecursion();
    int size = t.sc.nextInt();
    // Array
    int[] ar = new int[size];// 2,9,-1,0,25,4
    t.len = ar.length;// 
    int[] arr = t.input(ar, t.len);
    System.out.println();
    int[] b = t.getAcending(arr, t.len);
    System.out.print("Ascending Order is : ");
    t.print(b, t.len);
  }

  int j1 = 0;

  // take input in Array
  int[] input(int[] in, int len) {
    if (j1 != len) {
      System.out.print("Enter Element index of " + j1 + " : ");
      in[j1] = sc.nextInt();
      j1++;
      input(in, len);
    }
    return in;
  }

  // Ascending Process By Method recursion
  int i = 0;
  int j = i + 1;

  int[] getAcending(int[] aa, int len) {
    if (j < len) {
      if (aa[i] > aa[j]) {
        int temp = aa[j];
        aa[j] = aa[i];
        aa[i] = temp;
      }
      j++;
      return getAcending(aa, len);
    }
    i++;
    j = i + 1;
    if (i < len) {
      return getAcending(aa, len);
    }
    return aa;
  }

  int k = 0;

  // Print Array by mehtod Recursion
  int[] print(int[] bb, int len) {
    if (k != len) {
      System.out.print(bb[k] + " ");
      k++;
      print(bb, len);
    }
    return bb;
  }
}
// Yatish
//   static int[] arr = { 5, 0, -1, 2, 6 };
//   static void a(int i) {
//     if (i > arr.length) {
//       return;
//     }
//     b(i, i + 1);
//     a(i + 1);
//   }
//   static void b(int i, int j) {
//     if (j > arr.length) {
//       return;
//     }
//     int temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
//     b(i, j + 1);
//   }
//   public static void main(String[] args) {
//     System.out.println("entered");
//     a(0);
//     for (int i = 0; i < arr.length - 1; i++) {
//       System.out.println(arr[i]);
//     }
//   }
// }
