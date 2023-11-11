//  Create a method to calculate the average of an array of integers and return the result.
import java.util.Scanner;

public class Avg {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size for array");
    int size = sc.nextInt();
    int[] a = new int[size];
    System.out.println("Enter Element : ");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    Avg v = new Avg();
    v.process(a);
    System.out.println("Avarage is : " + v.sum / size);
  }

  int sum = 0;

  int process(int[] b) {
    for (int i = 0; i < b.length; i++) {
      sum = sum + b[i];
    }
    return sum;
  }
}
