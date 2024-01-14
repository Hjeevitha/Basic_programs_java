package array;

public class Accurence_array {

	public static void main(String[] args) {
		int[] a= {3,10,4,-1,10,3,-1,-1,20};
		for(int i=0;i<a.length;i++) {
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
					a[j]=Integer.MAX_VALUE;
				}
			}
			if(a[i]!=Integer.MAX_VALUE)
				System.out.println(a[i]+" => "+c);
		}

	}

}
