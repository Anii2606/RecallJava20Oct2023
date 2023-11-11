//  19. Define a method that counts the occurrences of a specific element in an integer array and returns the count
public class OccurrencesReturnsCount {

  public static void main(String[] args) {
    OccurrencesReturnsCount fdm = new OccurrencesReturnsCount();
    int[] arr = new int[] { 12, 13, 12, 13, 13, 13, 13, 33, 45, 45, 12, 13 };
    fdm.finddup(arr);
    // fdm.display(arr);
  }

  int[] finddup(int[] a) {
    // Scanner sc = new Scanner(System.in);
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] != -1 && a[i] == a[j]) {
          count++;
          // System.out.println(a[j]);
          a[j] = -1;
        }
      }
      // For Counting
      if (a[i] != -1) {
        System.out.println(a[i] + "  in Array  " + count + "  times");
        count = 0;
      }
      //return a;
    }
    return a;
  }
  // void display(int[] array) {
  //   System.out.println("Duplicate Element is :");
  //   for (int i = 0; i < array.length; i++) {
  //     if (array[i] != -1) {
  //       System.out.print(array[i] + " ");
  //     }
  //   }
  // }
}
