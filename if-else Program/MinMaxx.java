import java.util.Scanner;
public class MinMaxx{
public static void main (String[] args){
int num01;
int num02;
Scanner m=new Scanner(System.in);
System.out.println("Enter Any Two Number");
System.out.print("01  : ");
num01=m.nextInt();
System.out.print("02  : ");
num02=m.nextInt();
if(num01>num02){
	System.out.println("Maximum number is : "+num01);
	System.out.print("Minimum number is : "+num02);
	
}else if (num01==0&&num02==0){
	System.out.print("Number is :"+num01);
}else if (num01==num02){
	System.out.print(num01+" And "+num02+" Is Equal");
	
}else{
	System.out.println("Maximum number is : "+num02);
	System.out.print("Minimum number is : "+num01);
}



}
}