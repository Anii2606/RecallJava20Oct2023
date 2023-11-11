public class Cube {

  public static void main(String[] args) {
    int[] cub = { 1, 2, 3, 4, 5, 6 };
    int[] a = new int[cub.length];
    for (int i = 0; i < cub.length; i++) {
      a[i] = cub[i] * cub[i] * cub[i];
    }
    for (int j = 0; j < a.length; j++) {
      System.out.print(a[j] + " ");
    }
  }
}
