import java.util.Scanner;

class ArrayDemo2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int i;
		
		for(i=0; i<=4; i++){
			System.out.print("\n\tEnter the Values: ");
			a[i]=sc.nextInt();
		}
		
		System.out.print("\nDisplay the Values of Array & calculate the square of each element");
		int sqr;
		for(i=0 ; i<=4 ; i++){
			System.out.print("\n\n\ta["+i+"]"+" = "+a[i]);
			sqr = a[i] * a[i];
			System.out.print("\t\t Square: "+sqr);
		}
	}
	
	
}