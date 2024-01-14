package array;

public class Palindrome_array {

	public static void main(String[] args) {
		int[] a= {10,9,3,0,3,9,10};
		int j=a.length-1;
		boolean flag=true;
		for(int i=0;i<a.length/2;i++) {
			if(a[i]==a[j]) {
				j--;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("palindrome");

		}
		else {
			System.out.println("not palindrome");
		}
	}
}
