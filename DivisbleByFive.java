package array;

import java.util.Scanner;

public class DivisbleByFive {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int[] a=new int[size];
//		int[] a= {10,5,3,15,25,2};
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0)
			System.out.println(a[i]+"  ");
		}		
	}

}
