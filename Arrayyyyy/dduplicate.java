public class dduplicate {

  public static void main(String[] args) {
    int[] a = { 12, 12, 13, 14, 15, 13, 12, 15, 14, 14, 13, 13, 12 };
    System.out.println(" Duplicate Value in Array ");
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] != -1) {
          if (a[i] == a[j]) {
            a[j] = -1;
          }
        }
      }
      if (a[i] != -1) {
        System.out.println(a[i]);
      }
    }
  }
}
