import java.util.Scanner;
public class SwitchCase{
public static void main(String[] args){
System.out.println("Enter Two Number");
Scanner sc=new Scanner(System.in);
int num01;
int num02;
char oper;
System.out.print("First :");
num01=sc.nextInt();
System.out.print("Second :");
num02=sc.nextInt();
System.out.print("select Any operter Like =- (+, -, *, /, % ) :");
oper=sc.next().charAt(0);
System.out.println("-----------------------------------------------");
switch(oper){
	case '+' :
	System.out.println(num01+"+"+num02 +"="+(num01+num02));
	break;
	case '-' : 
	System.out.println(num01+"-"+num02 +"= " +(num01-num02));
	break;
	case '*' :
	System.out.println(num01+"*"+num02 +"= "+(num01*num02));
	break;
	case '/' : 
	System.out.println(num01+"/"+num02+ "= "+(num01/num02));
	break;
	case '%' :
	System.out.println(num01+"%"+num02 +"= "+(num01%num02));
	break;
	default : System.out.println("Invaild Value");
}
}
}



