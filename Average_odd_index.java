package array;

import java.util.Scanner;

public class Average_odd_index {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a= {3,4,1,7,11,20};
		int sum=0,count=0;
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("average of od index is "+sum/count);

	}
}
//3 4 1 7 11 20