import java.util.Scanner;
public class Days{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String days ;
System.out.print("Enter Any Days name(First Letter In Uppercase):");
days=sc.next();
//String days02=days;
System.out.println("-----------------------------------------------");
if (days.equals("Monday")) {
	System.out.println(":"+days +":");
	System.out.println("Your root is Kannod");
} 
else if (days.equals("Tuesday")) {
	System.out.println(":"+days +":");
	System.out.println("Your root is Bhopal");
}
 else if (days.equals("Wednesday")) {
	System.out.println(":"+days +":");
	System.out.println("Your root is Sujalpur");
}
else if (days.equals("Thursday") ){
	System.out.println(":"+days +":");
	System.out.println("Your root is Harda");
	
}
else if (days.equals("Friday")) {
	System.out.println(":"+days +":");
	System.out.println("Your root is Shivni");
}else if (days.equals("Suturday")) {
	System.out.println(":"+days +":");
	System.out.println("Your root is Rehti");
}else if (days.equals("Sunday")) {
	System.out.println(":"+days +":");
	System.out.println("Holiday");
}else{
	System.out.println("First letter is not Uppercase\nOr\nThis is not a name of days");
}

}
}



