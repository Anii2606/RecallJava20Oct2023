//  Write a method to sort an integer array in ascending order using any sorting algorithm (e.g., bubble sort, selection sort)

import java.util.Scanner;

public class AcsendingOrder {

  Scanner s = new Scanner(System.in);

  void arr() {
    System.out.println("Enter Size ");
    int size = s.nextInt();
    int[] a = new int[size];
    int[] i = input(a);
    int[] ii = acend(i);
    output(ii);
  }

  int[] input(int[] in) {
    System.out.println("Enter Elements ");
    for (int i = 0; i < in.length; i++) {
      in[i] = s.nextInt();
    }
    return in;
  }

  int[] acend(int[] ac) {
    for (int i = 0; i < ac.length; i++) {
      for (int j = i + 1; j < ac.length; j++) {
        // Bubble sort
        if (ac[i] > ac[j]) {
          int tem = ac[j];
          ac[j] = ac[i];
          ac[i] = tem;
        }
      }
    }
    return ac;
  }

  int[] output(int[] outt) {
    for (int i = 0; i < outt.length; i++) {
      System.out.print(outt[i] + " ");
    }
    return outt;
  }

  public static void main(String[] args) {
    AcsendingOrder acc = new AcsendingOrder();
    acc.arr();
  }
}
// // By Using Bobble sort
// public class AcsendingOrder {
//   Scanner s = new Scanner(System.in);
//   void arr() {
//     System.out.println("Enter Size ");
//     int size = s.nextInt();
//     int[] a = new int[size];
//     int[] i = input(a);
//     int[] ii = acend(i);
//     output(ii);
//   }
//   int[] input(int[] in) {
//     System.out.println("Enter Elements ");
//     for (int i = 0; i < in.length; i++) {
//       in[i] = s.nextInt();
//     }
//     return in;
//   }
//   int[] acend(int[] ac) {
//     for (int i = 0; i < ac.length; i++) {
//       for (int j = i + 1; j < ac.length; j++) {
//         // Bubble sort
//         if (ac[i] > ac[j]) {
//           int tem = ac[j];
//           ac[j] = ac[i];
//           ac[i] = tem;
//         }
//       }
//     }
//     return ac;
//   }
//   int[] output(int[] outt) {
//     for (int i = 0; i < outt.length; i++) {
//       System.out.print(outt[i] + " ");
//     }
//     return outt;
//   }
//   public static void main(String[] args) {
//     AcsendingOrder acc = new AcsendingOrder();
//     acc.arr();
//   }
