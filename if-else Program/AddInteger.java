import java.util.Scanner;
public class AddInteger{
public static void main(String []args){
int add;
Scanner sc =new Scanner (System.in);
add=sc.nextInt();
int [] num=new int [add];
for (int i=0;i<num.length;i++){
num[i]=sc.nextInt();
System.out.println(" ");
// for one time input 
//System.out.println(num[i]);
}
// take multiple time input and then print 
System.out.println(" ");
for (int i=0;i<num.length;i++){
System.out.println(num[i]);
}
}
}