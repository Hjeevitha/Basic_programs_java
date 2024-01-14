package array;

public class Binary_search {

	public static void main(String[] args) {
		int ele=70;
		int[] a= {10, 20, 30, 40, 50, 60, 70};
		int l=0;
		int r=a.length-1;
		boolean flag=false;
		while(l<=r) {
			int mid=(l+r)/2;
			System.out.println(" mid value "+mid);
			if(ele==a[mid]) {
				System.out.println("element found");
				flag=true;
				break;
			}
			else if(ele>a[mid]) {
				l=mid+1;
			}
			else if(ele<a[mid]) {
				r=mid-1;
			}

		}
		if(flag==false) {
			System.out.println("element not found");
		}

	}


}

