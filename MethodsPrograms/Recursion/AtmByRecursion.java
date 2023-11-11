package Recursion;

import java.util.Scanner;

public class AtmByRecursion {

  Scanner s = new Scanner(System.in);
  int pin = 2606;
  int amount = 12000;

  void input() {
    System.out.println("Enter your ATM Card ");
    System.out.println(
      "----------------------------------------------------------"
    );
    System.out.println(
      "Hi,Please do not remove your chip card leave your card inserted during the entire Transaction "
    );
    System.out.println(
      "----------------------------------------------------------"
    );
    System.out.println("Enter Any Number Between 10 to 99 for eg. " + "25");
    int num = s.nextInt();
    System.out.println(
      " Enter 1 for Enter Your Pin , AND 2 for Pin Generation "
    );
    int option = s.nextInt();
    if (option == 1) {
      System.out.println("Enter Your Pin ");
      int pin1 = s.nextInt();
      Balace(pin1);
      System.out.println("Balace in Account :" + amount);
    } else if (option == 2) {
      // System.out.println("Enter your Pin whose give from Bank ");
      // int bankPin = s.nextInt();
      // pin = generetedPin(bankPin);
      Balace(pin);
      System.out.println("Remove your Atm Card And again");
      System.out.println("Swap your Atm Card");
      // System.out.println("Select What you Want ");
      // System.out.println("(1) Withdraw , (2) Deposite , (3) Check Balace");
      Balace(pin);
    } else {
      System.out.println(" Wrong Input \n Choose Carefully ");
    }
  }

  int op = s.nextInt();

  int Balace(int pin1) {
    // System.out.println("Swap your Atm Card");
    // System.out.println("Select What you Want ");
    // System.out.println("(1) Withdraw , (2) Deposite , (3) Check Balace");
    // int op = s.nextInt();

    if (pin1 == pin) {
      pin = pin1;
      System.out.println("Select What you Want ");
      System.out.println(
        "(1) Withdraw , (2) Deposite , (3) Check Balace , (4) Pin Change "
      );
      int sele = s.nextInt();
      if (op == 1) {
        System.out.println("Withdraw Your Amount");
        int with = s.nextInt();
        WithdrawAmount(with);
      } else if (op == 2) {
        System.out.println("Withdraw Your Amount");
        int dipo = s.nextInt();
        Depositemoney(dipo);
      } else if (op == 3) {
        checkBlance(amount);
      } else {
        System.out.println("Wrong Input ");
      }
    } else {
      System.out.println("PLZ Enter Right Pin");
      return Balace(pin);
    }
    return amount;
  }

  int WithdrawAmount(int with) {
    amount = amount - with;
    if (amount < with) {
      System.out.println("You have not " + with + " Rupee in your Account ");
    } else {
      System.out.println(
        " After WithdrAW Your Total Amout is " + (amount - with)
      );
    }
    callReturn(c);
    if (callReturn(c) == "yes" || callReturn(c) == "Yes") {
      return Balace(pin);
    }
    return amount;
  }

  int Depositemoney(int Depo) {
    amount = amount + Depo;
    System.out.println(" After Deposite Your Amount is " + amount);
    callReturn(c);
    if (callReturn(c) == "yes" || callReturn(c) == "Yes") {
      return Balace(pin);
    }
    return amount;
  }

  int checkBlance(int amount) {
    System.out.println("Your Balance is : " + amount);
    callReturn(c);
    if (callReturn(c) == "yes" || callReturn(c) == "Yes") {
      return Balace(pin);
    }
    return amount;
  }

  int generetedPin(int genpin) {
    System.out.println("Check OTP  And Enter OTP");
    int otp = s.nextInt();
    System.out.println("Now Enter Your Pin ");
    int pin = s.nextInt();
    System.out.println("Your pin is Genereted Successfully");
    return pin;
  }

  public static void main(String[] args) {
    AtmByRecursion at = new AtmByRecursion();
    at.input();
  }

  String c = " ";

  String callReturn(String call) {
    System.out.println(
      "If You Want to Continue Enter y Or Y otherwise Enter n"
    );
    if (c == "yes" || c == "Yes") {
      return c;
    }
    return c;
  }
}
