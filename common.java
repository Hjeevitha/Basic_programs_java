package array;

import java.util.Arrays;

public class common {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {4,5,6,7,5};
		int[] d=commonarray(a,b);
		System.out.println(Arrays.toString(d));
	}
	
	static int[] commonarray(int[] a,int[] b) {
		int[] c=new int[a.length];
		int in=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					c[in]=a[i];
					in++;
					break;
				}
			}	
		}
		int[] d=new int[in];
		for(int k=0;k<in;k++) {
			d[k]=c[k];
		}
		return d;
	}

	

}
