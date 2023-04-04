package apr4.com;
import java.util.Scanner;
public class ArrayMaxMinAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[];
		int size;
		int sum=0;
		float avg=0;
		int max;
		int min;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		size=sc.nextInt();
		ar=new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt(); //reading the elements
		}
		
		
		// displaying 
		System.out.println("Array elements are: ");
		for(int i:ar)
		{
			System.out.println(i);
		}
		
		
		//sum
		for(int i:ar)
		{
			sum=sum+i; //sum+=i
		}
		System.out.println("sum: "+sum);
		
		
		//average
		avg=(float)sum/ar.length;
		System.out.println("Average: "+avg);
		
		
		//maximum
		max=ar[0];  //assume first number is largest
		
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Largest of array element: "+max);
		
		//minimum
		min=ar[0];  
		
		for(int i=1;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println("Smallest of array element: "+min);
		
	}

}
