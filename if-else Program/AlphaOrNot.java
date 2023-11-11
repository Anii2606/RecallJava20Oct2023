import java.util.Scanner;

public class AlphaOrNot {

  public static void main(String[] args) {
    System.out.println("Enter Anything");
    Scanner al = new Scanner(System.in);
    //int a ;
    char c;
    c = al.next().charAt(0);
    if (c > 64 && c < 91) {
      System.out.println("This is Alphabet");
    } else if (c >= 97 && c <= 122) {
      System.out.println("This is Alphabet");
    } else {
      System.out.println("This is not Alphabet");
    }
  }
}
