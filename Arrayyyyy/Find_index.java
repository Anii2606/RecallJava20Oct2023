class Find_index{
public static void main (String[] args){
	
	int[] a=new int [5];
	a[0]=10;
	a[1]=110;
	a[2]=120;
	a[3]=190;
	a[4]=1220;
	
	
	
	int find=190;
	for(int i = 0;i<5;i++){
		if(find==a[i]){
		System.out.print("Index value of "+ a[i] +" is "+ i );
			
		}
	}
}
}