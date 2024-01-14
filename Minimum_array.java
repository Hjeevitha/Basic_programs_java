package array;


public class Minimum_array {

	public static void main(String[] args) {
		int[] a= {20,30,100,-5,-25};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("manimum element is "+min);


	}

}

