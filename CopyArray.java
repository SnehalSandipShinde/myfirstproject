import java.util.Scanner;

class CopyArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int i;
		for(i=0; i<=4; i++){
			System.out.print("\n\tEnter the values: ");
			a[i] = sc.nextInt();
		}
		for(i=0; i<=4; i++){
			System.out.print("\n\n\t a["+i+"]= "+ a[i]);
		}
		System.out.print("\n Copy given Array into another Array: ");
		
		for(i=0; i<=4; i++){
			b[i] = a[i];
			System.out.print("\n\n\t b["+i+"]= "+ b[i]);
		}
	}


}