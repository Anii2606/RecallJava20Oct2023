import java.util.Scanner;
public class SeprateEvenOdd{
public static void main(String[] args){

System.out.println("Enter Any Number");
int num;
int even=0;
int odd=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt(); 
System.out.println("________________________________________________________-");
//System.out.println("SUM");

for( int i=1;i<=num;i++)
{
if(i%2==0){
	System.out.println("Even number : "+i);
	even=even+i;
	//System.out.println(even);
}
}
System.out.println("________________________________________________________");
System.out.println("Total of Even number : "+even);
System.out.println("________________________________________________________");
for( int i=1;i<=num;i++)
{
if(i%2!=0){
	System.out.println("Odd number : "+i);
	odd=odd+i;
	
}
}
System.out.println("________________________________________________________");
System.out.println("Total of Odd number : "+odd);
System.out.print("________________________________________________________");
}
}