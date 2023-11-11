import java.util.Scanner;
public class Calculoter{
public static void main(String[] args){
System.out.println("Enter Two Number");
Scanner sc=new Scanner(System.in);
int num01;
int num02;
char oper;
System.out.println("First");
num01=sc.nextInt();
System.out.println("Second");
num02=sc.nextInt();
System.out.println("select Any operter Like =- (+, -, *, /, % )");
oper=sc.next().charAt(0);
System.out.println("-----------------------------------------------");
if (oper=='+') {
	System.out.println("num01+num02 = "+(num01+num02));
} 
else if (oper=='-') {
	System.out.println("num01-num02 = "+(num01-num02));
}
 else if (oper=='*') {
	System.out.println("num01*num02 = "+(num01*num02));
}
else if (oper=='/') {
	if(num02==0){
		System.out.println(num01+" is not Divisibal "+num02);
	}else{
		System.out.println("num01/num02 = "+(num01/num02));
	}
	
}
else if (oper=='%') {
	System.out.println("num01%um02 = "+(num01%num02));
}else{
	System.out.println("Wrong Input");
}

}
}



