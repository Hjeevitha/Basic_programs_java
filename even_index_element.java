package array;

import java.util.Scanner;

public class even_index_element {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}

		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
