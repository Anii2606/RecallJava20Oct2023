import java.util.Scanner;
public class PosiNagi{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number");
int num;
num=sc.nextInt();
System.out.print("______________________________________________________");
if(num>0){
	System.out.print(num+" is positive");
}else if (num<0){
	System.out.print(num+" is Nagative");
}else{
	System.out.print(num+" is "+num);
}
}
}

