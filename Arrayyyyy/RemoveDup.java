public class RemoveDup {

  public static void main(String[] args) {
    int[] arr = new int[] { 12, 12, 56, 78, 12, 78, 56, 34 };
    //int[] arr2 = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          arr[j] = 0;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
