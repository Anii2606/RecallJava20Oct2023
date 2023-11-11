import java.util.Scanner;

public class StringFirstPrograms {

  public static void main(String[] args) {
    // Concat
    StringFirstPrograms sp = new StringFirstPrograms();
    // sp.con();
    // sp.rev();
    sp.palindrom();
  }

  void con() {
    String str = "Anikesh ";
    String str1 = "Chouhan ";
    int age = 23;
    System.out.println(str + str1 + age);
  }

  void rev() {
    String str = "Anikesh ";
    String str1 = "Chouhan ";
    //int age = 23;
    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }
    System.out.println();
    for (int i = str1.length() - 1; i >= 0; i--) {
      System.out.print(str1.charAt(i));
    }
    System.out.println();
  }

  void palindrom() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name (Palindrome)"); // lol
    String str;
    str = sc.nextLine(); // naman
    //String str1 = "";

    // String str1 = "";
    //String str1 = "Chouhan ";
    //int age = 23;

    int j = 0;
    for (int i = 0; i < str.length() - 1 - i; i++) {
      if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
        j++;
      } else {
        System.out.println("Not Palindrome");
        break;
      }
    }
    if (j != 0) {
      System.out.println("Palindrome");
    }
  }
}
