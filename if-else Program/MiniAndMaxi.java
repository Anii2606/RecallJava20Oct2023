// i am use do -while in this program

import java.util.Scanner;
public class MiniAndMaxi
{
 int maximum( int num1,int num2,int num3){
	int maxi =num1;
	if(num2>maxi){
		maxi=num2;
		if(num3>maxi){
			maxi=num3;
			
			
		}
		
	}
	return maxi;
}

 int minimum(int num1,int num2,int num3){
	int mini=num1;
	if (num2<mini){
		num2=mini;
		if(num3<mini){
		num3=mini;
		
		}
}

	return mini;
}


public static void main(String []args){	
char yn;
do{
Scanner sc =new Scanner(System.in);
	int num1;
	int num2;
	int num3;
	System.out.println ("Enter any three number");
	num1=sc.nextInt();
	num2=sc.nextInt();	
	num3=sc.nextInt();
	MiniAndMaxi a=new MiniAndMaxi();
	int max=a.maximum(num1,num2,num3);
	int min=a.minimum(num1,num2,num3);
	System.out.println ("maximum :"+max);	
	System.out.println ("Minimum :"+min);
	System.out.println ("if you wnat to continue press y and not continue press n");
yn=sc.next().charAt(0);
}
while((yn=='Y')||(yn=='y'));
}
}