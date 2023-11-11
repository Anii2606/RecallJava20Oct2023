public class DuplicateN {

  public static void main(String[] args) {
    int[] arr = new int[] { 12, 34, 56, 78, 12, 78, 56, 34 };
    int[] arr2 = new int[arr.length - 1];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == arr[j] && i != j) {
        arr2[j] = arr[i];
        j++;
      }
    }

    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
  }
}
