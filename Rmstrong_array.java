package array;

import java.util.Arrays;

public class Rmstrong_array {
	public static void main(String[] args) {

		int[] a= {1,6,3,4};
		int count=a.length;
		int sum=0,sum1=0;
		for(int i=0;i<a.length;i++) {
			int pow=1;
			sum1=sum1+a[i];
			for(int j=0;j<=a.length;j++) {
				pow=pow*a[i];
			}
			sum=sum+pow;
			System.out.println(sum);
			System.out.println(sum1);
		}
		int[] b=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
	}		

}

