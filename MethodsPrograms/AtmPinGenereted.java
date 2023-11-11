import java.util.Scanner;

public class AtmPinGenereted {

  String AccountNum = "9001235566575";
  String Phone = "9179901034";
  int bankPin = 0;
  Scanner scr = new Scanner(System.in);

  public static void main(String[] args) {
    AtmPinGenereted ag = new AtmPinGenereted();
    ag.enterAtm();
  }
void enterAtm(){
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
    int num = scr.nextInt();
    System.out.println(
      " Enter 1 for Enter Your Pin , AND 2 for Pin Generation "
    );
    int select = scr.nextInt();
    input(select);
}
  int input(int select) {
    String phonNUm = "0";
   
    if (select == 1) {
      System.out.println();
    } else if (select == 2) {
      System.out.println("Please Enter your Account Number ");
      String acNum = scr.next();
      if (AccountNum.equals(acNum)) {
        System.out.println("Enter Your Phone Number");
        phonNUm = scr.next();
        if (Phone.equals(phonNUm)) {
          System.out.println(
            "Your Transaction is being processed \n : Please Wait : "
          );
          System.out.println("Tranction compelete \n Please Take your card ");
          System.out.println(
            "You will get message form bank for generate pin (tempery pin) "
          );
          System.out.println("You can generete pin till 24 hours ");
          System.out.println(
            "If you Want Generate pin yet than enter yes otherwise no "
          );
          String yn = scr.next();
          if (yn.equals("Yes") || yn.equals("yes")) {
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
            System.out.println(
              "Enter Any Number Between 10 to 99 for eg. " + "25"
            );
            num = scr.nextInt();
            System.out.println("Enter Bank Pin  ");
            bankPin = scr.nextInt();
            System.out.println("Enter 1 for Change Pin , AND 2 for Banking  ");
            select = scr.nextInt();
            if (select == 1) {
              System.out.println("Enter your new Pin ");
              int pin = scr.nextInt();
              System.out.println("Re-Enter your Pin ");
              int repin = scr.nextInt();
              if (pin == repin) {
                bankPin = pin;
                System.out.println("Your Pin Is Genereted SuccessFully");
              } else {
                System.out.println("Your pin is Not Matched");
              }
            } else if (select == 2) {} else {}
          }
        }
      } else {
        System.out.println("Wrong Number ");
        System.out.println("Re-Enter Phone Number ");
        phonNUm = scr.next();
        if (Phone.equals(phonNUm)) {
          System.out.println(
            "Your Transaction is being processed \n : Please Wait : "
          );
          System.out.println("Tranction compelete \n Please Take your card ");
          System.out.println(
            "You will get message form bank for generate pin (tempery pin) "
          );
          System.out.println("You can generete pin till 24 hours ");
          System.out.println(
            "If you Want Generate pin yet than enter yes otherwise no "
          );
          String yn = scr.next();
          if (yn.equals("Yes") || yn.equals("yes")) {
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
            System.out.println(
              "Enter Any Number Between 10 to 99 for eg. " + "25"
            );
            num = scr.nextInt();
            System.out.println("Enter Bank Pin  ");
            bankPin = scr.nextInt();
            System.out.println("Enter 1 for Change Pin , AND 2 for Banking  ");
            select = scr.nextInt();
            if (select == 1) {
              System.out.println("Enter your new Pin ");
              int pin = scr.nextInt();
              System.out.println("Re-Enter your Pin ");
              int repin = scr.nextInt();
              if (pin == repin) {
                bankPin = pin;
                System.out.println("Your Pin Is Genereted SuccessFully");
              } else {
                System.out.println("Your pin is Not Matched");
              }
            } else {
              System.out.println("Go to your Bank");
            }
          }
        } else {
          System.out.println("Account Number is Wrong ");
          System.out.println("Re-Enter Your Account Number ");
          acNum = scr.next();
          if (AccountNum.equals(acNum)) {
            System.out.println("Enter Your Phone Number");
            phonNUm = scr.next();
            if (Phone.equals(phonNUm)) {
              System.out.println(
                "Your Transaction is being processed \n : Please Wait : "
              );
              System.out.println(
                "Tranction compelete \n Please Take your card "
              );
              System.out.println(
                "You will get message form bank for generate pin (tempery pin) "
              );
              System.out.println("You can generete pin till 24 hours ");
              System.out.println(
                "If you Want Generate pin yet than enter yes otherwise no "
              );
              String yn = scr.next();
              if (yn.equals("Yes") || yn.equals("yes")) {
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
                System.out.println(
                  "Enter Any Number Between 10 to 99 for eg. " + "25"
                );
                num = scr.nextInt();
                System.out.println("Enter Bank Pin  ");
                bankPin = scr.nextInt();
                System.out.println(
                  "Enter 1 for Change Pin , AND 2 for Banking  "
                );
                select = scr.nextInt();
                if (select == 1) {
                  System.out.println("Enter your new Pin ");
                  int pin = scr.nextInt();
                  System.out.println("Re-Enter your Pin ");
                  int repin = scr.nextInt();
                  if (pin == repin) {
                    bankPin = pin;
                    System.out.println("Your Pin Is Genereted SuccessFully");
                  } else {
                    System.out.println("Your pin is Not Matched");
                  }
                } else if (select == 2) {} else {}
              }
            } else {
              System.out.println("Wrong Number ");
              System.out.println("Re-Enter Phone Number ");
              phonNUm = scr.next();
              if (Phone.equals(phonNUm)) {
                System.out.println(
                  "Your Transaction is being processed \n : Please Wait : "
                );
                System.out.println(
                  "Tranction compelete \n Please Take your card "
                );
                System.out.println(
                  "You will get message form bank for generate pin (tempery pin) "
                );
                System.out.println("You can generete pin till 24 hours ");
                System.out.println(
                  "If you Want Generate pin yet than enter yes otherwise no "
                );
                String yn = scr.next();
                if (yn.equals("Yes") || yn.equals("yes")) {
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
                  System.out.println(
                    "Enter Any Number Between 10 to 99 for eg. " + "25"
                  );
                  num = scr.nextInt();
                  System.out.println("Enter Bank Pin  ");
                  bankPin = scr.nextInt();
                  System.out.println(
                    "Enter 1 for Change Pin , AND 2 for Banking  "
                  );
                  select = scr.nextInt();
                  if (select == 1) {
                    System.out.println("Enter your new Pin ");
                    int pin = scr.nextInt();
                    System.out.println("Re-Enter your Pin ");
                    int repin = scr.nextInt();
                    if (pin == repin) {
                      bankPin = pin;
                      System.out.println("Your Pin Is Genereted SuccessFully");
                    } else {
                      System.out.println("Your pin is Not Matched");
                    }
                  } else {
                    System.out.println("Go to your Bank");
                  }
                }
              }
            }
          } else {
            System.out.println("Invalid input Go to your bank ");
          }
        }
      }
    }
  }
}
