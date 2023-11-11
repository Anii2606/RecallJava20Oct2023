package Recursion;

import java.util.Scanner;

public class MarksheetByRecursion {

  String name = " ";
  String fname = " ";
  String mname = " ";
  String roll = " ";
  String subject = " ";
  int hindi, english, math, physics, chemstry;
  int tot = 0;
  int count = 0;
  int percant = 0;
  String grade = " ";
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    MarksheetByRecursion mR = new MarksheetByRecursion();
    System.out.println("Enter Your Name ");
    mR.name = mR.sc.nextLine();
    System.out.println("Enter Father Name ");
    mR.fname = mR.sc.nextLine();
    System.out.println("Enter mother Name ");
    mR.mname = mR.sc.nextLine();
    System.out.println("Enter Roll Number");
    mR.roll = mR.sc.nextLine();
    System.out.println("Enter Subject Number");
    mR.subject = mR.sc.nextLine();
    mR.processed(mR.hindi, mR.english, mR.math, mR.physics, mR.chemstry);
  }

  int hindii(int hind) {
    System.out.println("Hindi");
    hind = sc.nextInt();
    if (hind < 33 && count < 2) {
      count++;
    } else if (hind > 33) {
      System.out.println("Hindi : " + hind);
    } else {
      System.out.println("you Have to Give Re -Exam");
      main(null);
      processed(hind, english, math, physics, chemstry);
    }
    return hind;
  }

  int englishh(int eng) {
    System.out.println("English");
    eng = sc.nextInt();
    count++;
    return eng;
  }

  int mathh(int mat) {
    System.out.println("Mathmatics");
    mat = sc.nextInt();
    count++;
    return mat;
  }

  int physicss(int phy) {
    System.out.println("Physics");
    phy = sc.nextInt();
    count++;
    return phy;
  }

  int chemstryy(int chem) {
    System.out.println("Chemstry");
    chem = sc.nextInt();
    count++;
    return chem;
  }

  int total(int h, int e, int m, int p, int c) {
    int totall = h + e + m + p + c;
    return totall;
  }

  int percatage(int tot) {
    int per = tot / count;
    return per;
  }

  int processed(int hindi, int english, int math, int physics, int chemstry) {
    System.out.println("Enter Marks : ");
    this.hindi = hindii(hindi);
    this.english = englishh(english);
    this.math = mathh(math);
    this.physics = physicss(physics);
    this.chemstry = chemstryy(chemstry);
    tot =
      total(this.hindi, this.english, this.math, this.physics, this.chemstry);
    percant = percatage(tot);
    grade = grades(percant);
    marksheet();
    return 0;
  }

  String grades(int per) {
    if (per <= 100 && per >= 85) {
      grade = "A+";
      return grade;
    } else if (per < 85 && per >= 75) {
      grade = "A";
      return grade;
    } else if (per < 75 && per >= 65) {
      grade = "B";
      return grade;
    } else if (per < 65 && per >= 50) {
      grade = "C";
      return grade;
    } else if (per < 50 && per >= 33) {
      grade = "D";
      return grade;
    } else {
      System.out.println("You Are Failed ");
    }
    return grade;
  }

  int countSupply(int c) {
    // if (hindi < 33 ||english< 33 && count < 2||math < 33 && count < 2||physics < 33 && count < 2||chemstry < 33 && count < 2) {
    System.out.println(" you got Supply in  " + count + "Subject");
    if (hindi < 33) {
      System.out.println(" Hindi");
    } else if (english < 33) {
      System.out.println("English");
    } else if (math < 33) {
      System.out.println("Math");
    } else if (physics < 33) {
      System.out.println("Physics");
    } else if (chemstry < 33) {
      System.out.println("Chemstry");
    }
    System.out.println("Give re-exam \n Your Exam is done ");
    System.out.println("Enter marks of ");
    if (hindi < 33) {
      hindii(c);
    } else if (english < 33) {
      englishh(c);
    } else if (math < 33) {
      mathh(c);
    } else if (physics < 33) {
      physicss(c);
    } else if (chemstry < 33) {
      chemstryy(c);
    }
    return c;
  }

  void marksheet() {
    System.out.println(
      "   _________________________________________________________"
    );
    System.out.println(
      "  |                      12TH MARKSHEET                     |"
    );
    System.out.println(
      "  |_________________________________________________________|"
    );
    {
      System.out.println("  | Student name -  " + name + "  \t\t\t    |");
      System.out.println("  | Father name  -  " + fname + "  \t\t\t    |");
      System.out.println("  | Mother name  -  " + mname + "  \t\t\t    |");
      System.out.println("  | Roll number  -  " + roll + " \t\t\t\t    |");
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
        tot +
        "  |"
      );
      System.out.println(
        "  |                                | percantage = " +
        percant +
        "%       |"
      );
      System.out.println(
        "  |                                | Grade      = " +
        grade +
        "        |"
      );
      System.out.println(
        "  |________________________________|________________________|"
      );
    }
  }
}
// int Supply(
//     int hindi,
//     int english,
//     int math,
//     int chemstry,
//     int per,
//     int grade
//   ) {
//     System.out.println(
//       "--------------------------------------------------------------------------------------------------------"
//     );
//     if (hindi < 33) {
//       count++;
//       if (
//         hindi < 33 &&
//         count < 2 ||
//         english < 33 &&
//         count < 2 ||
//         math < 33 &&
//         count < 2 ||
//         physics < 33 &&
//         count < 2 ||
//         chemstry < 33 &&
//         count < 2
//       ) {
//         System.out.println("Supply in  " + count + "Subject");
//         System.out.println("Give re-exam \n Your Exam is done ");
//         System.out.println("Enter marks of ");
//         if (count < 2 && count > 0) {
//           System.out.println("Supply in 1 subject");
//         }
//         System.out.println(
//           "hindi :" + hindi + "\n" + "Your hindi subject marks is Less Than 33"
//         );
//         System.out.println("You got Supplementary in hindi");
//         System.out.println("You have to give supply Exam");
//         System.out.println("Your Exam is done ");
//         System.out.println("Enter your Supply marks (Hindi)");
//         hindi = sc.nextInt();
//         if (hindi > 33) {
//           System.out.println(
//             "Congratulation you Are passed Supply exam (Hindi)"
//           );
//         } else {
//           System.out.println(
//             "You re failed in hindi give the examination of class 12th"
//           );
//         }
//         //phy = physics;
//       } else {
//         System.out.println(
//           "Hindi :" +
//           hindi +
//           "\n" +
//           "Your Physics subject marks is More than 33"
//         );
//         System.out.println("You are passed in Physics");
//       }
//       System.out.println(
//         "--------------------------------------------------------------------------------------------------------"
//       );
//     }
//     return 0;
//   }
