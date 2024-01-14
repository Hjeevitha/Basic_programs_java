package array;

import java.util.Scanner;

public class dynamicinput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elemnets");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
	}

}
