import java.util.Scanner;

public class PalinByMethod {

  public static void main(String[] args) {
    PalinByMethod pbm = new PalinByMethod();
    pbm.palindrom();
  }

  void palindrom() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name (Palindrome)"); // lol
    String str;
    str = sc.nextLine();
    String str1 = "";

    // String str1 = "";

    //String str1 = "Chouhan ";
    //int age = 23;

    boolean j = false;
    for (int i = 0; i < str.length() - 1 - i; i++) {
      j = false;
      if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
        j = true;
      }
    }
    if (j == true) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
