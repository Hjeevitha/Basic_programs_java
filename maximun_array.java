package array;

public class maximun_array {

	public static void main(String[] args) {
		int[] a= {20,30,100,-5,-25};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum element is "+max);

	}

}

