package array;

import java.util.Scanner;

public class even_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter the size of the array");
       int size=s.nextInt();
       int[] a=new int[size];
       System.out.println("enter te elements");
       for(int i=0;i<a.length;i++) {
    	   a[i]=s.nextInt();
       }
       for(int i=0;i<a.length;i++) {
    	   if(a[i]%2==0)
    	   System.out.println(a[i]+" ");
       }
	}

}
