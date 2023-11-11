import java.util.Scanner;

public class Acsendingboolean {

  Scanner s = new Scanner(System.in);

  void ar() {
    System.out.println("Enter Size ");
    int size = s.nextInt();
    int[] a = new int[size];
    int[] i = inp(a);
    int[] ii = ace(i);
    System.out.println("Acsending Or Not ");
    System.out.println("yes(True),no(false) ---> " + (rightOrWrong(f)));
    //output(ii);
  }

  int[] inp(int[] in) {
    System.out.println("Enter Elements ");
    for (int i = 0; i < in.length; i++) {
      in[i] = s.nextInt();
    }
    return in;
  }

  boolean f = true;

  int[] ace(int[] ac) {
    for (int i = 0; i < ac.length; i++) {
      for (int j = i + 1; j < ac.length; j++) {
        // Bubble sort
        if (ac[i] > ac[j]) {
          f = false;
          break;
          //   int tem = ac[j];
          //   ac[j] = ac[i];
          //   ac[i] = tem;
        }
      }
      if (f == false) {
        break;
      }
    }
    return ac;
  }

  boolean rightOrWrong(boolean f1) {
    if (f1) {
      return f1;
    }
    return f1;
  }

  //   int[] output(int[] outt) {
  //     for (int i = 0; i < outt.length; i++) {
  //       System.out.print(outt[i] + " ");
  //     }
  //     return outt;
  //   }

  public static void main(String[] args) {
    Acsendingboolean acc = new Acsendingboolean();
    acc.ar();
  }
}
