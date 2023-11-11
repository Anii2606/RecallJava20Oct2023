import java.util.Scanner;
public class LeaapYearr{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Year");
int year;
year=sc.nextInt();
System.out.print("______________________________________________________");
if(year%4==0&&year%100!=0){
	System.out.println(year+" is Leap year");
}else if (year%400==0&&year%100==0){
	System.out.println(year+" is Century year\nAnd");
	System.out.print("Also Leap year");
}else{
	System.out.println(year+" is not a Leap year");
}
}
}