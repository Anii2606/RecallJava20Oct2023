import java.util.Scanner;
public class Voting{
	
	public static void main(String[] args){
	Scanner vot=new Scanner(System.in);
	System.out.println("Check you are aligibal or not for voting");
	String name;
	int age;
	
	System.out.println("Inter your name ");
	name=vot.nextLine();
	
	System.out.println("Inter your age ");
	age=vot.nextInt();
	
	System.out.println("/");
	if (age>=18){
	System.out.println(name);
	System.out.println("Adult ,you Can voting ");
}else if(age>=15){
	System.out.println(name);
	System.out.println("Teenages");	
}else{
	System.out.println(name);
	System.out.println("Child ");
}


}
}