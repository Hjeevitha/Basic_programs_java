package array;

import java.util.Scanner;

public class Average_array {

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
        System.out.println("the sum is "+sum);
        System.out.println("the average is "+sum/a.length);

	}

}
// 10 3 4 7 9 11
