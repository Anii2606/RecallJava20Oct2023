import java.util.Scanner;
public class NaturalNum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int  n ;
int total=0;
System.out.print("Enter number :");
n=sc.nextInt();
System.out.print("______________________________________________________");
for(int i=1;i<=n;i++){
	total=total+i;
	System.out.print(total+"+");
}
System.out.println();
System.out.println("Total of "+n+" nutural number is :"+total);
}
}