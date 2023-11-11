// Write a method to find the maximum of two integers and return the larger number.
// Define a method to find the minimum element in an integer array and return it.
import java.util.Scanner;

public class LargestSmallestNum {

  int largeSmall = 0;
  static LargestSmallestNum ln = new LargestSmallestNum();

  void scan() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two Number ");
    System.out.print("Num(1) : ");
    int n1 = sc.nextInt();
    System.out.print("Num(2) : ");
    int n2 = sc.nextInt();
    largeSmall = ln.large(n1, n2);
    ln.output(largeSmall);
    largeSmall = ln.small(n1, n2);
    ln.output1(largeSmall);
  }

  int large(int l, int l1) {
    if (l > l1) {
      return l;
    }
    return l1;
  }

  int small(int l2, int l3) {
    if (l2 < l3) {
      return l2;
    }
    return l3;
  }

  int output(int o) {
    System.out.println("Largest Number is : " + o);
    return o;
  }

  int output1(int o) {
    System.out.println("Smallest Number is : " + o);
    return o;
  }

  public static void main(String[] args) {
    ln.scan();
  }
}
