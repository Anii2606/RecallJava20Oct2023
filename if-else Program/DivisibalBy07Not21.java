public class DivisibalBy07Not21 {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      // System.out.println(i);
      if (i % 7 == 0 && i % 21 != 0) {
        System.out.println(i);
      }
    }
  }
}
