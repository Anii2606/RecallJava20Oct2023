import java.util.Scanner;

public class Leap {

  boolean b = false;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any year");
    int year = sc.nextInt();
    Leap l = new Leap();
    boolean z = l.process(year);
    System.out.println(z);
    l.output(z);
  }

  boolean process(int year) {
    // boolean b = false;
    if (
      year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 100 == 0
    ) {
      b = true;
    }
    return b;
  }

  boolean output(boolean bo) {
    if (bo == true) {
      System.out.println("Leap Year");
    } else {
      System.out.println("Not Leap Year");
    }
    return bo;
  }
}
