import java.util.Scanner;
public class Operaters{
	static float a=10 ,b=7;
public static void main(String []args){

 //first Arithmetic operaters
 System.out.println("Arthmetic opereter");

System.out.println("Enter any two integer number");
Scanner sc =new Scanner(System.in);
System.out.println("First number");
a=sc.nextFloat();
System.out.println("Second  number");
b=sc.nextFloat();
System.out.println("Addition of a & b is  :"+ (a+b) );
System.out.println("Subctaction of a & b is :"+ (a-b) );
System.out.println("multification of a & b is :"+ (a*b) );
System.out.println("dividetion of a & b is :"+ (a/b) );
System.out.println("moduls of a & b is :"+ (a%b ));

// Relation op
System.out.println("Relation opereter" );
System.out.println("a=b :" + (a=b));
System.out.println("a!=b :" + (a!=b) );
System.out.println("a>=b :" + (a>=b));
System.out.println("a<=b :" + (a<=b));
System.out.println("a>b :" + (a>b));
System.out.println("a<b :" + (a<b));
}
}