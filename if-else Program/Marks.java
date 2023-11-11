import java.util.Scanner;

public class Marks {

  public static void main(String[] args) {
    //char y = ' ';
    Scanner sc = new Scanner(System.in);

    int hindi, english, physics, math, chemstry;
    int total = 0;
    String str = " ";
    System.out.print("Enter Student name :");
    String name = sc.nextLine();

    System.out.print("Enter Student  Father name :");
    String fName = sc.nextLine();

    System.out.print("Enter Student  Mother name :");
    String mName = sc.nextLine();

    System.out.print("Enter Student  Roll number :");
    int rollNum = sc.nextInt();

    System.out.print("Enter Student  Subject(Stream) :");
    String subject = sc.next();

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
    //ELSE PART

    /////////////////////////////////////////////////////////////////////////////////////////
    else {
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

      if (hindi < 33) {
        count++;
      }

      if (english < 33) {
        count++;
      }

      if (physics < 33) {
        count++;
      }

      if (math < 33) {
        count++;
      }
      if (chemstry < 33) {
        count++;
      }
      if (count == 1) {
        System.out.println("Supply in 1 subject");
      } else if (count == 2) {
        System.out.println("Supply in 2 subject");
      } else {
        System.out.println(
          "You have supply in more than 2 subject\nYou have to give re-exam"
        );
      }

      if (hindi < 33) {
        System.out.println("Supply : Hindi");
      }

      if (english < 33) {
        System.out.println("Supply : English");
      }

      if (physics < 33) {
        System.out.println("Supply : Physics");
      }

      if (math < 33) {
        System.out.println("Supply : Mathematics");
      }
      if (chemstry < 33) {
        System.out.println("Supply : Chemstry");
      }
      // ELSE PART
      ////////////////////////////////////////////////////////////////////////////////
      if (count < 3) {
        if (hindi < 33) {
          System.out.println("You have to give supply Exam");
          System.out.println(
            "---------------------------------------------------------------------"
          );
          System.out.println("Your Exam is done ");
          System.out.println("Enter your Supply marks (Hindi)");
          hindi = sc.nextInt();
          if (hindi > 33) {
            System.out.println(
              "Congratulation you Are passed Supply exam (Hindi)"
            );
          } else {
            System.out.println(
              "You re failed in hindi \nYou have to give re-exam class 12th"
            );
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
            per = total / 5;
            if (
              math > 33 &&
              physics > 33 &&
              chemstry > 33 &&
              hindi > 33 &&
              english > 33
            ) {
              System.out.println(
                "  | Student name -  " + name + "  \t\t\t    |"
              );
              System.out.println(
                "  | Father name  -  " + fName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Mother name  -  " + mName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Roll number  -  " + rollNum + " \t\t\t\t    |"
              );
              System.out.println(
                "  | Subject      - " + subject + "  \t\t\t     |"
              );
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
                "  |   English    |        100      |        " +
                english +
                "    \t    |"
              );
              System.out.println(
                "  |   physics    |        100      |        " +
                physics +
                "  \t    |"
              );
              System.out.println(
                "  |   Mathmetics |        100      |        " +
                math +
                "  \t    |"
              );
              System.out.println(
                "  |   Chemstry   |        100      |        " +
                chemstry +
                "  \t    |"
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
                "  |                                | percantage = " +
                per +
                "%       |"
              );
              System.out.println(
                "  |________________________________|________________________|"
              );
              if (per <= 100 && per >= 80) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + " A++");
              } else if (per < 80 && per >= 70) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("Grade :" + "A");
              } else if (per < 70 && per >= 60) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + "B");
              } else if (per < 60 && per >= 50) {
                System.out.println("Grade :" + "C");
              } else if (per < 50 && per >= 45) {
                System.out.println("    Grade :" + "D");
              } else {
                System.out.println("    Grade :" + "E");
              }
            }
          }
          // do{

          // }while();
          // hin = hindi;
        }

        if (english < 33) {
          System.out.println("You have to give supply Exam");
          System.out.println(
            "----------------------------------------------------------------------"
          );
          System.out.println("Your Exam is done ");
          System.out.println("Enter your Supply marks (English)");
          english = sc.nextInt();
          if (english > 33) {
            System.out.println(
              "Congratulation you Are passed Supply exam (English)"
            );
          } else {
            System.out.println(
              "You re failed in English \nYou have to give re-exam class 12th"
            );
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
            per = total / 5;
            if (
              math > 33 &&
              physics > 33 &&
              chemstry > 33 &&
              hindi > 33 &&
              english > 33
            ) {
              System.out.println(
                "  | Student name -  " + name + "  \t\t\t    |"
              );
              System.out.println(
                "  | Father name  -  " + fName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Mother name  -  " + mName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Roll number  -  " + rollNum + " \t\t\t\t    |"
              );
              System.out.println(
                "  | Subject      - " + subject + "  \t\t\t     |"
              );
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
                "  |   English    |        100      |        " +
                english +
                "    \t    |"
              );
              System.out.println(
                "  |   physics    |        100      |        " +
                physics +
                "  \t    |"
              );
              System.out.println(
                "  |   Mathmetics |        100      |        " +
                math +
                "  \t    |"
              );
              System.out.println(
                "  |   Chemstry   |        100      |        " +
                chemstry +
                "  \t    |"
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
                "  |                                | percantage = " +
                per +
                "%       |"
              );
              System.out.println(
                "  |________________________________|________________________|"
              );
              if (per <= 100 && per >= 80) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + " A++");
              } else if (per < 80 && per >= 70) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("Grade :" + "A");
              } else if (per < 70 && per >= 60) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + "B");
              } else if (per < 60 && per >= 50) {
                System.out.println("Grade :" + "C");
              } else if (per < 50 && per >= 45) {
                System.out.println("    Grade :" + "D");
              } else {
                System.out.println("    Grade :" + "E");
              }
            }
          }
        }
        //en = english

        if (physics < 33) {
          System.out.println("You have to give supply Exam");
          System.out.println(
            "------------------------------------------------------------------"
          );
          System.out.println("Your Exam is done ");
          System.out.println("Enter your Supply marks (Physics)");
          physics = sc.nextInt();
          if (physics > 33) {
            System.out.println(
              "Congratulation you Are passed Supply exam (Physics)"
            );
          } else {
            System.out.println(
              "You re failed in Physics\nYou have to give re-exam class 12th"
            );
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
            per = total / 5;
            if (
              math > 33 &&
              physics > 33 &&
              chemstry > 33 &&
              hindi > 33 &&
              english > 33
            ) {
              System.out.println(
                "  | Student name -  " + name + "  \t\t\t    |"
              );
              System.out.println(
                "  | Father name  -  " + fName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Mother name  -  " + mName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Roll number  -  " + rollNum + " \t\t\t\t    |"
              );
              System.out.println(
                "  | Subject      - " + subject + "  \t\t\t     |"
              );
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
                "  |   English    |        100      |        " +
                english +
                "    \t    |"
              );
              System.out.println(
                "  |   physics    |        100      |        " +
                physics +
                "  \t    |"
              );
              System.out.println(
                "  |   Mathmetics |        100      |        " +
                math +
                "  \t    |"
              );
              System.out.println(
                "  |   Chemstry   |        100      |        " +
                chemstry +
                "  \t    |"
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
                "  |                                | percantage = " +
                per +
                "%       |"
              );
              System.out.println(
                "  |________________________________|________________________|"
              );
              if (per <= 100 && per >= 80) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + " A++");
              } else if (per < 80 && per >= 70) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("Grade :" + "A");
              } else if (per < 70 && per >= 60) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + "B");
              } else if (per < 60 && per >= 50) {
                System.out.println("Grade :" + "C");
              } else if (per < 50 && per >= 45) {
                System.out.println("    Grade :" + "D");
              } else {
                System.out.println("    Grade :" + "E");
              }
            }
          }
          //phy = physics;

        }
        if (math < 33) {
          System.out.println("You have to give supply Exam");
          System.out.println(
            "-----------------------------------------------------------------"
          );
          System.out.println("Your Exam is done ");
          System.out.println("Enter your Supply marks (Mathametics)");
          math = sc.nextInt();

          if (math > 33) {
            System.out.println(
              "Congratulation you Are passed Supply exam (Mathametics)"
            );
          } else {
            System.out.println(
              "You re failed in Mathematics \nYou have to give re-exam class 12th"
            );
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
            per = total / 5;
            if (
              math > 33 &&
              physics > 33 &&
              chemstry > 33 &&
              hindi > 33 &&
              english > 33
            ) {
              System.out.println(
                "  | Student name -  " + name + "  \t\t\t    |"
              );
              System.out.println(
                "  | Father name  -  " + fName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Mother name  -  " + mName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Roll number  -  " + rollNum + " \t\t\t\t    |"
              );
              System.out.println(
                "  | Subject      - " + subject + "  \t\t\t     |"
              );
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
                "  |   English    |        100      |        " +
                english +
                "    \t    |"
              );
              System.out.println(
                "  |   physics    |        100      |        " +
                physics +
                "  \t    |"
              );
              System.out.println(
                "  |   Mathmetics |        100      |        " +
                math +
                "  \t    |"
              );
              System.out.println(
                "  |   Chemstry   |        100      |        " +
                chemstry +
                "  \t    |"
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
                "  |                                | percantage = " +
                per +
                "%       |"
              );
              System.out.println(
                "  |________________________________|________________________|"
              );
              if (per <= 100 && per >= 80) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + " A++");
              } else if (per < 80 && per >= 70) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("Grade :" + "A");
              } else if (per < 70 && per >= 60) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + "B");
              } else if (per < 60 && per >= 50) {
                System.out.println("Grade :" + "C");
              } else if (per < 50 && per >= 45) {
                System.out.println("    Grade :" + "D");
              } else {
                System.out.println("    Grade :" + "E");
              }
            }
          }
          //matth = math;

        }

        if (chemstry < 33) {
          System.out.println("You have to give supply Exam");
          System.out.println(
            "----------------------------------------------------------------"
          );
          System.out.println("Your Exam is done ");
          System.out.println("Enter your Supply marks (Chemstry)");
          chemstry = sc.nextInt();
          if (chemstry > 33) {
            System.out.println(
              "Congratulation you Are passed Supply exam (Chemstry)"
            );
          } else {
            System.out.println(
              "You re failed in Chemstry \nYou have to give re-exam class 12th"
            );
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
            per = total / 5;
            if (
              math > 33 &&
              physics > 33 &&
              chemstry > 33 &&
              hindi > 33 &&
              english > 33
            ) {
              System.out.println(
                "  | Student name -  " + name + "  \t\t\t    |"
              );
              System.out.println(
                "  | Father name  -  " + fName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Mother name  -  " + mName + "  \t\t\t    |"
              );
              System.out.println(
                "  | Roll number  -  " + rollNum + " \t\t\t\t    |"
              );
              System.out.println(
                "  | Subject      - " + subject + "  \t\t\t     |"
              );
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
                "  |   English    |        100      |        " +
                english +
                "    \t    |"
              );
              System.out.println(
                "  |   physics    |        100      |        " +
                physics +
                "  \t    |"
              );
              System.out.println(
                "  |   Mathmetics |        100      |        " +
                math +
                "  \t    |"
              );
              System.out.println(
                "  |   Chemstry   |        100      |        " +
                chemstry +
                "  \t    |"
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
                "  |                                | percantage = " +
                per +
                "%       |"
              );
              System.out.println(
                "  |________________________________|________________________|"
              );
              if (per <= 100 && per >= 80) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + " A++");
              } else if (per < 80 && per >= 70) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("Grade :" + "A");
              } else if (per < 70 && per >= 60) {
                System.out.println(
                  "   Congratulation : " +
                  name +
                  "\n   You have passed\n   Your 12th Exam  "
                );
                System.out.println("    Grade :" + "B");
              } else if (per < 60 && per >= 50) {
                System.out.println("Grade :" + "C");
              } else if (per < 50 && per >= 45) {
                System.out.println("    Grade :" + "D");
              } else {
                System.out.println("    Grade :" + "E");
              }
            }
          }
          //chem = chemstry;
        }
      }
      if (count < 3) {
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
          hindi +
          "        \t    |"
        );
        System.out.println(
          "  |   English    |        100      |        " +
          english +
          "    \t    |"
        );
        System.out.println(
          "  |   physics    |        100      |        " + physics + "  \t    |"
        );
        System.out.println(
          "  |   Mathmetics |        100      |        " + math + "  \t    |"
        );
        System.out.println(
          "  |   Chemstry   |        100      |        " +
          chemstry +
          "  \t    |"
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
          "  |                                | percantage = " +
          per +
          "%       |"
        );
        System.out.println(
          "  |________________________________|________________________|"
        );
      }
      //Re -EXAMs

      if (count > 2) {
        System.out.println("You are failed ,Give re Exam");
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
        per = total / 5;
        if (
          math > 33 &&
          physics > 33 &&
          chemstry > 33 &&
          hindi > 33 &&
          english > 33
        ) {
          System.out.println("  | Student name -  " + name + "  \t\t\t    |");
          System.out.println("  | Father name  -  " + fName + "  \t\t\t    |");
          System.out.println("  | Mother name  -  " + mName + "  \t\t\t    |");
          System.out.println(
            "  | Roll number  -  " + rollNum + " \t\t\t\t    |"
          );
          System.out.println(
            "  | Subject      - " + subject + "  \t\t\t     |"
          );
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
            "  |   English    |        100      |        " +
            english +
            "    \t    |"
          );
          System.out.println(
            "  |   physics    |        100      |        " +
            physics +
            "  \t    |"
          );
          System.out.println(
            "  |   Mathmetics |        100      |        " + math + "  \t    |"
          );
          System.out.println(
            "  |   Chemstry   |        100      |        " +
            chemstry +
            "  \t    |"
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
            "  |                                | percantage = " +
            per +
            "%       |"
          );
          System.out.println(
            "  |________________________________|________________________|"
          );
          if (per <= 100 && per >= 80) {
            System.out.println(
              "   Congratulation : " +
              name +
              "\n   You have passed\n   Your 12th Exam  "
            );
            System.out.println("    Grade :" + " A++");
          } else if (per < 80 && per >= 70) {
            System.out.println(
              "   Congratulation : " +
              name +
              "\n   You have passed\n   Your 12th Exam  "
            );
            System.out.println("Grade :" + "A");
          } else if (per < 70 && per >= 60) {
            System.out.println(
              "   Congratulation : " +
              name +
              "\n   You have passed\n   Your 12th Exam  "
            );
            System.out.println("    Grade :" + "B");
          } else if (per < 60 && per >= 50) {
            System.out.println("Grade :" + "C");
          } else if (per < 50 && per >= 45) {
            System.out.println("    Grade :" + "D");
          } else {
            System.out.println("    Grade :" + "E");
          }
        }
      }
    }
  }
}
