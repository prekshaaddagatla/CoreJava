package apr4.com;
import java.util.Scanner;
public class AcceptDataAndPerformOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[];
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		size=sc.nextInt();
		ar=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt(); //reading the elements
		}
		for(int i:ar) // display elements
		{
			System.out.println(i);
		}
		System.out.println(ar);
		int ar2[]=ar.clone(); // shallow copy ka cloning
		System.out.print(ar2);
	}

}

