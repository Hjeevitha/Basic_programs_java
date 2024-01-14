package array;

public class Duplicate_number {

		public static void main(String[] args) {
			int[] a= {1,10,20,1,1,2,10,20,3,3};
			for(int i=0;i<a.length;i++) {
				int c=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						c++;
						a[j]=Integer.MAX_VALUE;
					}
				}
				if(a[i]!=Integer.MAX_VALUE && c>=2) {
					System.out.println(a[i]+"==>"+c);
				}
			}

		}

	}