public class FibboByMethed {

  int first = 0;
  int second = 1;
  int third;

  public static void main(String[] args) {
    FibboByMethed fm = new FibboByMethed();
    System.out.print(fm.first + " ");
    System.out.print(fm.second + " ");
    fm.fibbo(10);
  }

  void fibbo(int a) {
    if (a >= 1) {
      third = first + second;
      System.out.print(third + " ");
      first = second;
      second = third;
      fibbo(a - 1);
    }
    // for (int i = 1; i < 5; i++) {
    //   third = first + second;
    //   first = second;
    //   second = third;
    //   System.out.print(third + " ");
    // }
  }
}
