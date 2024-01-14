package array;

import java.util.Arrays;

public class Reverse_array_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {209,321,564};
		System.out.println("array befor "+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			int rev=0;
			while(a[i]>0) {
				int rem=a[i]%10;
				rev=rev*10+rem;
				a[i]=a[i]/10;			
			}
			a[i]=rev;
		}
		System.out.println("array after "+Arrays.toString(a));

	}

}
