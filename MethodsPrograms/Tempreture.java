import java.util.Scanner;

public class Tempreture {

  int num;
  int fe;
  String str;

  public static void main(String[] args) {
    Tempreture t = new Tempreture();
    t.input();
    // t.process(t.num);
    t.ch(t.str);
    t.output(t.fe);
  }

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Tempreture number ");
    num = sc.nextInt();
    System.out.println("What do you want ");
    System.out.println("Celsius to fehrenheit(Enter Cf)");
    System.out.println("Fehrenheit to celsius(Enter Fc)");
    System.out.println("Celsius to kalvin(Enter Ck)");
    System.out.println("Kalvin to Celsius(Enter Kc)");
    System.out.println("Fehrenheit to kalvin(Enter Fk)");
    System.out.println("Kalvin to fehrenheit(Enter Kf)");
    str = sc.next();
  }

  String ch(String c) {
    switch (c) {
      case "Cf":
        fe = (num * 9 / 5) + 32;
        break;
      case "Fc":
        fe = (num - 32) * 5 / 9;
        break;
      case "Kc":
        fe = num - 273;
        break;
      case "Ck":
        fe = num + 273;
        break;
      case "Fk":
        fe = (num - 32) * 5 / 9 + 273;
        break;
      case "Kf":
        fe = (num - 273) * 9 / 5 + 32;
        break;
      default:
        System.out.println("Wrong Input");
        break;
    }
    return c;
  }

  //   int process(int n) {
  //     fe = (n * 9 / 5) + 32;
  //     return n;
  //   }

  int output(int f) {
    System.out.println(num + " == " + f);
    return f;
  }
}
