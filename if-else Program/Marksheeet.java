import java.util.Scanner;

public class Marksheeet {

  public static void main(String[] args) {
    //char y = ' ';
    int count = 0;
    Scanner sc = new Scanner(System.in);
    //     do {

    // System.out.println("if you want to continue press y otherwise press n");
    //       y = sc.next().charAt(0);
    //     while (y == 'Y' || y == 'y');
    //     }
    // while();

    System.out.println("MARKSHEET");
    System.out.println("Enter Your Marks : ");
    int hindi, english, physics, math, chemstry;
    int total = 0;
    String str = " ";

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
      "__________________________________________________________________________________"
    );
    System.out.println(
      "                                         12TH MARKSHEET                           "
    );
    System.out.println(
      "__________________________________________________________________________________"
    );
    int hin, en, phy, matth, chem;
    if (hindi < 33) {
      System.out.println(
        "Hindi :" + hindi + "\n" + "Your hindi subject marks is Less than 33"
      );
      str = "Supplementry";
      System.out.println("You got Supplementary in Hindi");

      System.out.println("You have to give supply Exam");
      System.out.println("Your Exam is done ");
      System.out.println("Enter your Supply marks (Hindi)");
      hindi = sc.nextInt();
      if (hindi > 33) {
        System.out.println("Congratulation you Are passed Supply exam (Hindi)");
      } else {
        System.out.println(
          "You re failed in hindi give the examination of class 12th"
        );
      }
      // do{

      // }while();
      // hin = hindi;
    } else {
      System.out.println(
        "Hindi :" + hindi + "\n" + "Your hindi subject marks is More than 33"
      );
      System.out.println("You are passed in Hindi");
    }

    System.out.println(
      "--------------------------------------------------------------------------------------------------------"
    );

    if (english < 33) {
      count++;
      if (count < 2 && count > 0) {
        System.out.println("Supply in 1 subject");
      }
      System.out.println(
        "English :" +
        english +
        "\n" +
        "Your English subject marks is Less Than 33"
      );
      str = "Supplementry";
      System.out.println("You got Supplementary in English");
      System.out.println("You have to give supply Exam");
      System.out.println("Your Exam is done ");
      System.out.println("Enter your Supply marks (English)");
      english = sc.nextInt();
      if (english > 33) {
        System.out.println(
          "Congratulation you Are passed Supply exam (English)"
        );
      } else {
        System.out.println(
          "You re failed in hindi give the examination of class 12th"
        );
      }
      //en = english;
    } else {
      System.out.println(
        "English :" +
        english +
        "\n" +
        "Your English subject marks is More than 33"
      );
      System.out.println("You are passed in English");
    }

    System.out.println(
      "--------------------------------------------------------------------------------------------------------"
    );

    if (physics < 33) {
      count++;
      if (count < 2 && count > 0) {
        System.out.println("Supply in 1 subject");
      }
      System.out.println(
        "Physics :" +
        physics +
        "\n" +
        "Your Physics subject marks is Less Than 33"
      );
      str = "Supplementry";
      System.out.println("You got Supplementary in Physics");
      System.out.println("You have to give supply Exam");
      System.out.println("Your Exam is done ");
      System.out.println("Enter your Supply marks (Physics)");
      hindi = sc.nextInt();
      if (physics > 33) {
        System.out.println(
          "Congratulation you Are passed Supply exam (Physics)"
        );
      } else {
        System.out.println(
          "You re failed in hindi give the examination of class 12th"
        );
      }
      //phy = physics;

    } else {
      System.out.println(
        "Physics :" +
        physics +
        "\n" +
        "Your Physics subject marks is More than 33"
      );
      System.out.println("You are passed in Physics");
    }

    System.out.println(
      "--------------------------------------------------------------------------------------------------------"
    );

    if (math < 33) {
      count++;
      if (count < 2 && count > 0) {
        System.out.println("Supply in 1 subject");
      }
      System.out.println(
        "Mathematics :" +
        math +
        "\n" +
        "Your Mathematics subject marks is Less Than 33"
      );
      str = "Supplementry";
      System.out.println("You got Supplementary in Mathematics");
      System.out.println("You have to give supply Exam");
      System.out.println("Your Exam is done ");
      System.out.println("Enter your Supply marks (Mathametics)");
      hindi = sc.nextInt();
      if (math > 33) {
        System.out.println(
          "Congratulation you Are passed Supply exam (Mathametics)"
        );
      } else {
        System.out.println(
          "You re failed in hindi give the examination of class 12th"
        );
      }
      //matth = math;

    } else {
      System.out.println(
        "Mathematics :" +
        math +
        "\n" +
        "Your Mathematics subject marks is More than 33"
      );
      System.out.println("You are passed in Mathematics");
    }

    System.out.println(
      "--------------------------------------------------------------------------------------------------------"
    );

    if (chemstry < 33) {
      count++;
      if (count < 2 && count > 0) {
        System.out.println("Supply in 1 subject");
      }
      System.out.println(
        "Chemstry :" +
        chemstry +
        "\n" +
        "Your Chemstry subject marks is Less Than 33"
      );
      str = "Supplementry";
      System.out.println("You got Supplementary in Chemstry");
      System.out.println("You have to give supply Exam");
      System.out.println("Your Exam is done ");
      System.out.println("Enter your Supply marks (Chemstry)");
      hindi = sc.nextInt();
      if (chemstry > 33) {
        System.out.println(
          "Congratulation you Are passed Supply exam (Chemstry)"
        );
      } else {
        System.out.println(
          "You re failed in hindi give the examination of class 12th"
        );
      }
      chem = chemstry;
      count++;
    } else {
      System.out.println(
        "Chemstry :" +
        chemstry +
        "\n" +
        "Your Chemstry subject marks is More than 33"
      );
      System.out.println("You are passed in Chemstry");
    }

    System.out.println(
      "--------------------------------------------------------------------------------------------------------"
    );

    if (str == "Supplementry") {
      System.out.println(" Supplementry Exam ");
    }
    if (count < 2 && count > 0) {
      System.out.println("Supply in 1 subject");
    } else if (count < 3 && count > 1) {
      System.out.println("Supply in 2 Subject");
    } else {
      System.out.println("You are failed in Exam");
    }
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
    }
  }
}
