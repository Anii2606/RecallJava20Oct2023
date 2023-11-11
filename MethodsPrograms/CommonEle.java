public class CommonEle {

  int[] a = { 1, 2, 3, 1, 3, 3, 1, 5, 2, 1, 7, 8 };
  int[] b = { 3, 3, 3, 3, 4, 6, 8 };

  public static void main(String[] args) {
    CommonEle ce = new CommonEle();
    ce.common(ce.a, ce.b);
  }

  int count = 0;

  void common(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < b.length; j++) {
        if (a[j] != -1 && a[i] == a[j]) {
          a[j] = -1;
        }
      }
      for (int j1 = 0; j1 < b.length; j1++) {
        if (b[j1] != -1 && a[i] == b[j1]) {
          b[j1] = -1;
          count++;
        }
      }

      if (count != 0 && a[i] != -1) {
        System.out.print(a[i] + "  ");
      }
      count = 0;
    }
  }
}
