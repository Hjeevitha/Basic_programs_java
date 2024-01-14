package array;

import java.util.Arrays;

public class copy_array {

	public static void main(String[] args) {
		int[] a= {23,47,59,55,211,109,11};
		int[] b= new int[a.length];
		System.out.println("first array "+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("copied array "+Arrays.toString(b));

	}

}
