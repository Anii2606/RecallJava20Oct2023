import java.util.Scanner;

public class ReverseArr {

  static void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size ");
    int size = sc.nextInt();
    int[] a = new int[size];
    System.out.println("Enter Elemnets ");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }

    int[] arr = reverse(a);
    output(arr);
  }

  static int[] reverse(int[] re) {
    for (int i = 0; i <= re.length - 1 - i; i++) {
      int temp = re[i];
      re[i] = re[re.length - 1 - i];
      re[re.length - 1 - i] = temp;
    }
    // for (int i = re.length - 1; i >= 0; i--) {
    //   int temp = re[re.length - 1];
    //   re[re.length - 1] = re[re.length - 1 - i];
    //   re[re.length - 1 - i] = temp;
    // }

    return re;
  }

  public static void main(String[] args) {
    //ReverseArr r = new ReverseArr();
    input();
  }

  static int[] output(int[] aa) {
    for (int i = 0; i < aa.length; i++) {
      System.out.print(aa[i] + " ");
    }
    return aa;
  }
}
