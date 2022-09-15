import java.util.Scanner;

class ArrayDemo1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int r[] = new int[5];    	//declaring an array and create a space into the memory
		int i;
		
		//Storing value into an array
		for(i=0; i<=4; i++){
			System.out.print("\n\t Enter the value: ");
			r[i] = sc.nextInt();
		}
		
		//displaying array values from an array
		System.out.print("\n\n\t***Displaying values***");
		System.out.print("\n\n\t\t Array values are:-");
		
		for(i=0;i<=4; i++){
			//System.out.print("\n\n\t value is "+ r[i]);
			System.out.print("\n\t\t\tr["+i+"]"+" = "+r[i]);
			
		}
		
	}
	
}