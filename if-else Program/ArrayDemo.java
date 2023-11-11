import java.util.Arrays;
public class ArrayDemo{
public static void main(String []args){
	// way of that how to define Array

// 01	
//String[] a;
//a=new String[3];

//02
//String [] a =new String[3];
//a[0]="Anikesh";
//a[1]="Harshit";
//a[2]="Saloni";

//03
//String a[]={"Anikesh","Harshit","Saloni"}

// 04 
String[] a= new String []{"Anikesh","Harshit","Saloni"};

// Ways of print Array elements

// 01 // for loops 
for (int i=0;i<a.length;i++){
	System.out.println(a[i]);	
}

System.out.println(" ");

// 02 for each loop 
for (String i:a){
	System.out.println(i);
}

System.out.println(" ");

// 03 toString method by output
System.out.println(Arrays.toString(a));

System.out.println(" ");

//04 naive way (normal way)
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);



}
}