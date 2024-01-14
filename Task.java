package array;

import java.util.Arrays;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int num1=num;

		//	enter the number and creating array with a size of count
		int count=0;
		while(num>0) {
			int rem=num%10;
			count++;
			num=num/10;			
		}
		System.out.println("count is "+count);
		int[] arr=new int[count];
		
		//reverse the number	
		int rev=0;
		while(num1>0) {
			int rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;			
		}
		System.out.println("reverse is "+rev);
		//extract the number and store in array
		int i=0;
		while(rev>0) {
			int rem=rev%10;
				arr[i]=rem;
				i++;
			rev=rev/10;
		}
		System.out.println(Arrays.toString(arr));
		
		//		printing prime number
		System.out.println("prime numbers are");
		for(int j=0;j<count;j++) {
			int c=0;
			for(int k=1;k<=arr[j];k++) {
				if(arr[j]%k==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(arr[j]+" ");
			}
		}
	}
}
