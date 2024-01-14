package array;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of first array");
		int siz1=s.nextInt();
		int a[]=new int[siz1];
		for(int i=0;i<siz1;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the size of second array");
		int size2=s.nextInt();
		int[] b=new int[size2];
		for(int i=0;i<size2;i++) {
			b[i]=s.nextInt();
		}
		int[] c=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[j];
				j++;
			}
		}
		System.out.println("first array is "+Arrays.toString(a));
		System.out.println("second array is "+Arrays.toString(b));
		System.out.println("merged array is "+Arrays.toString(c));
	}

}
