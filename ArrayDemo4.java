import java.util.Scanner;

class ArrayDemo4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		int b[] = new int[5];
		int i;
		
		for(i=0; i<=4; i++){
			System.out.print("\n\t Enter the values: ");
			a[i]= sc.nextInt();
		}
		System.out.print("\n\tNow display the cube of each element of Array");
		
		for(i=0; i<=4; i++){
			System.out.print("\n\n\t\t\ta["+i+"]= "+a[i]);
			b[i]=a[i]*a[i]*a[i];
			System.out.print("\t\t\tCube= "+b[i]);
			//System.out.print("\tCube= "+a[i]*a[i]*a[i]);
		}
		for(i=0; i<=4; i++){
			System.out.print("\n\t\t\tb[]= "+b[i]);
		}
		
		
	}


}