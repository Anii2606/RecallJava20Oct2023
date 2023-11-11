import java.util.Scanner;
public class PosiNagi{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number");
int num;
num=sc.nextInt();
System.out.println("______________________________________________________");
if(num>0){
	System.out.println(num+" is positive number");
}else if (num<0){
	System.out.println(num+" is Nagative number");
}else{
	System.out.println(num+" is base of positive And Nagative ");
}
}
}

