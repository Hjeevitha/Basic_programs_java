package array;

public class prime_elemnet {

	public static void main(String[] args) {

		int[] a= {23,40,59,55,211,109,11};

		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a[i]);
			}		
		}

	}

}


