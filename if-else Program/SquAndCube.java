import java.util.Scanner;
public class SquAndCube{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number");
int num;
String str;
num=sc.nextInt();
System.out.println("Enter if you want (Square , Cube)");
str=sc.next();
if(str.equalsIgnoreCase("Square")){
System.out.println("Square :"+(num*num));	
}else if (str.equalsIgnoreCase("Cube")){
	System.out.println("Cube :"+(num*num*num));
}else{
	System.out.println("Not Use 3rd word");
}

}
}