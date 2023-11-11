import java.util.Scanner;

public class MsByM {

  static String name;
  static String fName;
  static String mName;
  static int rollNum;
  static String subject;

  public static void main(String[] args) {}

  public static void display() {
    Scanner sc = new Scanner(System.in);

    int hindi, english, physics, math, chemstry;
    int total = 0;
    // String str = " ";
    System.out.print("Enter Student name :");
    name = sc.nextLine();

    System.out.print("Enter Student  Father name :");
    fName = sc.nextLine();

    System.out.print("Enter Student  Mother name :");
    mName = sc.nextLine();

    System.out.print("Enter Student  Roll number :");
    rollNum = sc.nextInt();

    System.out.print("Enter Student  Subject(Stream) :");
    subject = sc.next();

    int count = 0;
    System.out.println("Enter Your Marks : ");
    System.out.print("Hindi : ");
    hindi = sc.nextInt();

    System.out.print("English : ");
    english = sc.nextInt();

    System.out.print("Physics : ");
    physics = sc.nextInt();

    System.out.print("Math : ");
    math = sc.nextInt();

    System.out.print("Chemstry : ");
    chemstry = sc.nextInt();

    System.out.println(
      "   _________________________________________________________"
    );
    System.out.println(
      "  |                      12TH MARKSHEET                     |"
    );
    System.out.println(
      "  |_________________________________________________________|"
    );
    total = hindi + english + chemstry + math + physics;
    int per = total / 5;
    if (
      math > 33 && physics > 33 && chemstry > 33 && hindi > 33 && english > 33
    ) {
      System.out.println("  | Student name -  " + name + "  \t\t\t    |");
      System.out.println("  | Father name  -  " + fName + "  \t\t\t    |");
      System.out.println("  | Mother name  -  " + mName + "  \t\t\t    |");
      System.out.println("  | Roll number  -  " + rollNum + " \t\t\t\t    |");
      System.out.println("  | Subject      - " + subject + "  \t\t\t     |");
      System.out.println(
        "  |_________________________________________________________|"
      );
      System.out.println(
        "  |   Sub.name   |    Total marks  |    sub.marks     \t    |"
      );
      System.out.println(
        "  |______________|_________________|________________________|"
      );
      System.out.println(
        "  |    Hindi     |        100      |        " +
        hindi +
        "        \t    |"
      );
      System.out.println(
        "  |   English    |        100      |        " + english + "    \t    |"
      );
      System.out.println(
        "  |   physics    |        100      |        " + physics + "  \t    |"
      );
      System.out.println(
        "  |   Mathmetics |        100      |        " + math + "  \t    |"
      );
      System.out.println(
        "  |   Chemstry   |        100      |        " + chemstry + "  \t    |"
      );
      System.out.println(
        "  |______________|_________________|________________________|"
      );
      System.out.println(
        "  |  Total Marks = 600 " +
        "            | Total sub.Marks : " +
        total +
        "  |"
      );
      System.out.println(
        "  |                                | percantage = " + per + "%       |"
      );
      System.out.println(
        "  |________________________________|________________________|"
      );
      if (per <= 100 && per > 80) {
        System.out.println(
          "   Congratulation : " +
          name +
          "\n   You have passed\n   Your 12th Exam  "
        );
        System.out.println("    Grade :" + " A++");
      } else if (per < 80 && per > 70) {
        System.out.println("Grade :" + "A");
      } else if (per < 70 && per > 60) {
        System.out.println("Grade :" + "B");
      } else if (per < 60 && per > 50) {
        System.out.println("Grade :" + "C");
      } else if (per < 50 && per > 45) {
        System.out.println("Grade :" + "D");
      } else {
        System.out.println("Grade :" + "E");
      }
    }
  }

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public static void suply() {
    System.out.println("  | Student name -  " + name + "  \t\t\t    |");
    System.out.println("  | Father name  -  " + fName + "  \t\t\t    |");
    System.out.println("  | Mother name  -  " + mName + "  \t\t\t    |");
    System.out.println("  | Roll number  -  " + rollNum + " \t\t\t\t    |");
    System.out.println("  | Subject      - " + subject + "  \t\t\t     |");
    System.out.println(
      "  |_________________________________________________________|"
    );
    System.out.println(
      "  |   Sub.name   |    Total marks  |    sub.marks     \t   |"
    );
    System.out.println(
      "  |______________|_________________|________________________|"
    );
    System.out.println(
      "  |    Hindi     |        100      |        " +
      MsByM.display().hindi +
      "        \t    |"
    );
    System.out.println(
      "  |   English    |        100      |        " + english + "    \t    |"
    );
    System.out.println(
      "  |   physics    |        100      |        " + physics + "  \t    |"
    );
    System.out.println(
      "  |   Mathmetics |        100      |        " + math + "  \t    |"
    );
    System.out.println(
      "  |   Chemstry   |        100      |        " + chemstry + "  \t    |"
    );
    System.out.println(
      "  |______________|_________________|________________________|"
    );
    System.out.println(
      "  |  Total Marks = 600 " +
      "            | Total sub.Marks : " +
      total +
      "  |"
    );
    System.out.println(
      "  |                                | percantage = " + per + "%       |"
    );
    System.out.println(
      "  |________________________________|________________________|"
    );
  }
}
