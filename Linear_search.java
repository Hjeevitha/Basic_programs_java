package array;


import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the element to be searched");
		int ele=s.nextInt();
		boolean flag=false;
		for(int j=0;j<a.length;j++) {
			 if(a[j]==ele) {
				 flag=true;	
				 break;
			 }
		}
		if(flag==false) {
			System.out.println("element not found");
		}
		else {
			System.out.println("element found");
		}
		
		
	}

}
