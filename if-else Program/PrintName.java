import java.util.Scanner;
public class PrintName{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number");
int num;
num=sc.nextInt();
for(int i=1;i<=num;i++){
	if(i==5){
	System.out.println("Anikesh");
	}else{
		System.out.println(i);
	}
}


}
}