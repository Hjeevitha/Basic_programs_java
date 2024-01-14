package array;

import java.util.Arrays;

public class Reverse_array {

	public static void main(String[] args) {
		int[] a= {4,3,2,10,50,33};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------");
		int[] b=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
	}

}

