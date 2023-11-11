import java.util.Scanner;

public class Avrage {

  public static void main(String[] args) {
    //int[] avr = new int[] { 11, 10, 55, 6, 8 };
    Scanner c = new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int size = c.nextInt();
    int[] avr = new int[size];
    System.out.println("Enter Elements ");
    for (int i = 0; i < avr.length; i++) {
      avr[i] = c.nextInt();
    }
    int mid;
    for (int i = 0; i < avr.length; i++) {
      for (int j = i + 1; j < avr.length; j++) {
        if (avr[i] > avr[j]) {
          mid = avr[i];
          avr[i] = avr[j];
          avr[j] = mid;
        }
      }
    }
    for (int k : avr) {
      System.out.print(k + " ");
    }
    System.out.println();
    System.out.print("Avarage Element is :" + avr[(avr.length) / 2]);
  }
}
