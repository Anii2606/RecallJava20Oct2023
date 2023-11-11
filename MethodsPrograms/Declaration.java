public class Declaration {

  int num1 = 100;
  int num2 = 200;

  public static void main(String[] args) {
    Declaration a = new Declaration();
    a.add();
    a.num1 = 10;
    a.num2 = 20;
    a.add();
    //  System.out.println(a.num1 + a.num2);

    a.num1 = 30;
    a.num2 = 40;
    a.add();
    //  System.out.println(a.num1 + a.num2);
  }

  void add() {
    System.out.print(num1 + num2 + " ");
  }
}
