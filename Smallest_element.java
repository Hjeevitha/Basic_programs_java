package array;

public class Smallest_element {

	public static void main(String[] args) {
		int[] a= {10,202,79};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
