public class Merge {

  public static void main(String[] args) {
    int[] a = { 12, 13, 14, 15, 16, 17, 18 };
    int[] b = { 19, 20, 21, 22, 23, 24 };
    int totalLe = a.length + b.length;
    System.out.println(totalLe);
    int[] c = new int[totalLe];
    for (int i = 0; i < a.length; i++) {
      c[i] = a[i];
    }
    for (int i = 0; i < b.length; i++) {
      c[a.length + i] = b[i];
    }
    for (int y : c) {
      System.out.print(y + " ");
    }
  }
}
