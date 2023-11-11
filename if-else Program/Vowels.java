import java.util.Scanner;
public class Vowels{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Alphabet");
char charc;
charc=sc.next().charAt(0);
if(charc=='a'||charc=='A'||charc=='e'||charc=='E'||charc=='i'||charc=='I'||charc=='o'||charc=='O'||charc=='u'||charc=='U'){
	System.out.println(charc+" is Vowels");
}else{
	System.out.println(charc+" is Consonent");
}
}
}