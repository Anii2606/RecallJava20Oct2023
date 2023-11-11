import java.util.Scanner;

public class dupilcateCount {

  public static void main(String[] args) {
    Scanner c = new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int size = c.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter Elements ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = c.nextInt();
    }
    int count = 0;
    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] != -2) {
        System.out.print("Element " + arr[i] + " is ");
      }

      for (int j = i + 1; j <= arr.length - 1; j++) {
        if (arr[j] != -2 && arr[i] == arr[j]) {
          count++;
          arr[j] = -2;
        }
      }
      if (arr[i] != -2) {
        System.out.println(count);
      }
      count = 0;
    }
  }
}
