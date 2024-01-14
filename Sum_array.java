package array;

import java.util.Scanner;

public class Sum_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int sum=0;
        for(int i=0;i<a.length;i++) {
        	sum=sum+a[i];
        }
        System.out.println("the sum of numbers are "+sum);
	}

}
//2 3 4 7 9 11