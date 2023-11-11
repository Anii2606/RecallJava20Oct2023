//  Write a method to find the maximum of two integers and return the larger number.
import java.util.Scanner;

public class MInMax {

  public int max(int[] array) {
    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public int min(int[] array) {
    int min = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array:");
    int s = sc.nextInt();
    int[] Arr = new int[s];
    System.out.println("Enter the elements of the array : ");

    for (int i = 0; i < Arr.length; i++) {
      Arr[i] = sc.nextInt();
    }
    sc.close();
    MInMax m = new MInMax();
    System.out.println("Maximum value in the array is::" + m.max(Arr));
    System.out.println("Minimum value in the array is::" + m.min(Arr));
  }
}
