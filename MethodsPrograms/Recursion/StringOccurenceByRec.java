package Recursion;

import java.util.Scanner;

public class StringOccurenceByRec {

  Scanner s = new Scanner(System.in);

  String input(String nam) {
    nam = s.nextLine();
    return nam;
  }

  int i = 0;
  int j = i + 1;
  int count = 1;

  String countOccuren(String namm, int leng) { // naman
    if (j < leng) {
      if ("namm.charAt(j)" != " " && namm.charAt(i) == namm.charAt(j)) {
        count++;
        namm = namm.contains("namm.charAt(j)", " ");
        j++;
        return countOccuren(namm, leng);
      } else {
        j++;
        return countOccuren(namm, leng);
      }
    }
    if (i < leng) {
      System.out.println(
        "Character " + namm.charAt(i) + " in String " + count + " Times"
      );
    }
    count = 1;
    if (i < leng) {
      i++;
      j = i + 1;
      return countOccuren(namm, leng);
    }
    return namm;
  }

  public static void main(String[] args) {
    String name = " ";
    StringOccurenceByRec sr = new StringOccurenceByRec();
    String name1 = sr.input(name);
    int len = name1.length();
    String newname = sr.countOccuren(name1, len);
    // System.out.println();
  }
}
