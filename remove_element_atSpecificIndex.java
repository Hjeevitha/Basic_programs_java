package array;

import java.util.Arrays;
import java.util.Scanner;

public class remove_element_atSpecificIndex {

	public static void main(String[] args) {
		int in=3;
		int[] a= {20,30,40,90,100,500};
		int[] b=new int[a.length-1];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(i==in) {

			}
			else {
				b[j]=a[i];
				j++;//if arrays not same then we should take j
			}	
		}
		System.out.println(Arrays.toString(b));
	}

}
