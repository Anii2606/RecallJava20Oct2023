import java.util.Scanner;
public class UpAndLowCase{
public static void main(String[] args){
char c;
Scanner ulc=new Scanner(System.in);
System.out.println("Enter Any Alphabet");
c=ulc.next().charAt(0);
if(c>=97&&c<=122){
	System.out.println(c +" : Is In Lowercase");
}else if(c>=65&&c<=90){
	System.out.println(c +" : Is In Uppercase");
}else {
	System.out.println(c +" : Not a Alphabet");
}
}
}