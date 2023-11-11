import java.util.Scanner;

public class Rrandom {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Rrandom ran = new Rrandom();
    char c = ' ';
    int max = 1000;
    int min = 1;
    int ran = (int) (Math.random() * ((max - min) + 1) + min);
    // for (int i = 0; i < 25; i++) {
    // System.out.print(ran + "  ");
    // }
    do {
      System.out.print("Enter a random Number : ");
      int input = sc.nextInt();

      if (input == ran) {
        System.out.println(input + " is Currect Number");
      } else if (input > ran) {
        System.out.println(
          input + " is Greater than random number" + "\nTry Again"
        );
      } else {
        System.out.println(
          input + " is Lower than random number" + "\nTry Again"
        );
      }
      System.out.println(
        "If you want to play again than Enter ( y or Y )Otherwise Enter ( N )"
      );
      c = sc.next().charAt(0);
    } while (c == 'y' || c == 'Y');
    sc.close();
  }
}
