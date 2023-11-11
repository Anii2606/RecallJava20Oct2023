import java.util.Scanner;

public class RemoveDup {

  static Scanner s = new Scanner(System.in);

  void input() {
    System.out.println("Enter Size ");
    int size = s.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter Element ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt();
    }
    System.out.println("Before Remove Duplicate Element'");
    display(arr);
    int[] ar = finddup(arr);
    System.out.println();
    System.out.println("After Remove Duplicate Element'");
    display(ar);
  }

  public static void main(String[] args) {
    RemoveDup fdm = new RemoveDup();
    fdm.input();
  }

  int[] finddup(int[] a) {
    // Scanner sc = new Scanner(System.in);
    //  int count = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] != -1 && a[i] == a[j]) {
          //count++;
          //   System.out.println(a[j]);
          a[j] = -1;
        }
      }
      // For Counting
      //   if (a[i] != -1) {
      //     System.out.println(a[i] + "  in Array  " + count + "  times");
      //     count = 0;
      //   }
      //return a;
    }
    return a;
  }

  int[] display(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] != -1) {
        System.out.print(array[i] + " ");
      }
    }
    return array;
  }
}
