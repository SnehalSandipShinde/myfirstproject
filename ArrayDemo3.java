import java.util.Scanner;

class ArrayDemo3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
		int i;
		
		for(i=0; i<=4; i++){
			System.out.print("\n\tEnter the values: ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("\nDisplay the Reverse Array");
		
		for(i=4; i>=0 ; i--){
			System.out.print("\n\t\ta["+i+"]= "+a[i]);
		}
		
	}


}