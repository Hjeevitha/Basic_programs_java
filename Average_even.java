package array;

import java.util.Scanner;

public class Average_even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a= {20,3,7,2,10,5,6};
		int sum=0,count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println(sum+" "+count);
		System.out.println("average of od index is "+sum/count);
		

	}

}
