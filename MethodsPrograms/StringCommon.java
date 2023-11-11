public class StringCommon {

  public static void main(String[] args) {
    String str = "chaman";
    String str1 = "raaaaaamaaaaan";
    StringCommon sc = new StringCommon();
    sc.check(str, str1);
  }

  String check(String st, String st1) {
    for (int i = 0; i < st.length(); i++) {
      boolean f = false;
      // boolean f1 = false;
      // for (int j = i + 1; j < st.length(); j++) {
      //   //f1 = false;
      //   if (st.charAt(i) == st.charAt(j)) {
      //     f1 = true;
      //   }
      // }
      for (int j = 0; j < st1.length(); j++) {
        if (st.charAt(i) == st1.charAt(j)) {
          f = true;
        }
      }
      if (f == true) {
        System.out.println(st.charAt(i));
      }
    }
    return (st1);
  }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  public static void main(String[] args) {
//     String str = "chaman";
//     StringCommon sc = new StringCommon();
//     sc.check(str, str1);
//   }
//   String check(String st, String st1) {
//     for (int i = 0; i < st.length(); i++) {
//       boolean f = false;
//       for (int j = i + 1; j < st.length(); j++) {
//         if (st.charAt(i) == st.charAt(j)) {
//           f = true;
//         }
//       }
//       if (f == true) {
//         System.out.println(st.charAt(i));
//       }
//     }
//     return (st1);
//   }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  public static void main(String[] args) {
//   String a = "Anikesh";
//   String b = "Anikesh";
//   // a and b are in String Constant pool so both Memory ref is same
//   // and == opreter is comparing ref of two String that is reason a==b(true)
//   // but c is creted by new keyword so that c has another memory ref so a==c(False)
//   String c = new String("Anikesh");
//   // int count = 0;
//   if (a == b) {
//     // if (count < 1) {
//     System.out.println(a + " , " + b + " Both are Equal");
//     // count++;
//     // }
//   } else {
//     System.out.println(a + " , " + b + " Both Are Not Equal");
//   }
//   if (a == c) {
//     // if (count < 1) {
//     System.out.println(a + " , " + c + " Both are Equal");
//     // count++;
//     // }
//   } else {
//     System.out.println(a + " , " + c + " Both Are Not Equal");
//   }
// }
