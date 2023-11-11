import java.util.Scanner;

public class Graduation {

  public static void main(String[] args) {
    char y = ' ';
    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("MARKSHEET");

      int math1, math2, math3;
      int physics1, physics2;
      int computer1, computer2;
      int hindi, english, evironment;

      int total = 0;

      System.out.println("Enter Your math1 Marks");
      math1 = sc.nextInt();

      System.out.println("Enter Your math2 Marks");
      math2 = sc.nextInt();

      System.out.println("Enter Your math3 Marks");
      math3 = sc.nextInt();

      System.out.println("Enter Your english Marks");
      physics1 = sc.nextInt();

      System.out.println("Enter Your physics Marks");
      physics2 = sc.nextInt();

      System.out.println("Enter Your math Marks");
      math = sc.nextInt();

      System.out.println("Enter Your chemstry Marks");
      chemstry = sc.nextInt();

      total = hindi + english + chemstry + math + physics;
      int per = total / 5;

      if (
        per > 35 &&
        math < 35 &&
        physics < 35 &&
        chemstry < 35 &&
        hindi < 35 &&
        english < 35
      ) {
        if (per <= 100 && per > 80) {
          System.out.println("Percatage :" + per + "\n" + "Grade :" + "A++");
        } else if (per < 80 && per > 70) {
          System.out.println("Percatage :" + per + "\n" + "Grade :" + "A");
        } else if (per < 70 && per > 60) {
          System.out.println("Percatage :" + per + "\n" + "Grade :" + "B");
        } else if (per < 60 && per > 50) {
          System.out.println("Percatage :" + per + "\n" + "Grade :" + "C");
        } else if (per < 50 && per > 45) {
          System.out.println("Percatage :" + per + "\n" + "Grade :" + "D");
        } else {
          System.out.println("Percatage :" + per + "\n" + "Grade :" + "E");
        }
      } else {
        System.out.println(
          "Percatage :" + per + "\n" + "Supplimently in One Subject"
        );
        if (
          hindi < 35 &&
          english < 35 ||
          hindi < 35 &&
          math < 35 ||
          hindi < 35 &&
          physics < 35 ||
          hindi < 35 &&
          chemstry < 35
        ) {
          System.out.println("Supplimently in two Subject");
        } else if (
          english < 35 &&
          hindi < 35 ||
          english < 35 &&
          math < 35 ||
          english < 35 &&
          physics < 35 ||
          english < 35 &&
          chemstry < 35
        ) {
          System.out.println("Supplimently in two Subject");
        } else if (
          math < 35 &&
          hindi < 35 ||
          math < 35 &&
          english < 35 ||
          math < 35 &&
          physics < 35 ||
          math < 35 &&
          chemstry < 35
        ) {
          System.out.println("Supplimently in two Subject");
        } else if (
          physics < 35 &&
          hindi < 35 ||
          physics < 35 &&
          english < 35 ||
          physics < 35 &&
          math < 35 ||
          physics < 35 &&
          chemstry < 35
        ) {
          System.out.println("Supplimently in two Subject");
        } else if (
          chemstry < 35 &
          hindi < 35 ||
          chemstry < 35 &&
          english < 35 ||
          chemstry < 35 &&
          physics < 35 ||
          chemstry < 35 &&
          math < 35
        ) {
          System.out.println("Supplimently in two Subject");
        } else {
          System.out.println("You are Failed");
        }
        System.out.println("if you want to continue press y otherwise press n");
        y = sc.next().charAt(0);
      }
    } while (y == 'Y' || y == 'y');
  }
}
