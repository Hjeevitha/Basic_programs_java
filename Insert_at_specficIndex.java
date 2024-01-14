package array;

import java.util.Arrays;

public class Insert_at_specficIndex {

	public static void main(String[] args) {
		int index=3;
		int ele=40;
		int[] a= {10,20,30,50,60};
		int[] b=new int[a.length+1];
		int j=0;
		for(int i=0;i<b.length;i++) {
			if(i==index) {
				b[i]=ele;
			}
			else {
				b[i]=a[j];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(b));
	}

}
