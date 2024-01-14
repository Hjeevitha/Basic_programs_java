package array;

public class String_contains_onlyletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello43";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				count++;
			}
		}
		if(s.length()==count) {
			System.out.println("string contains only letter");
		}
		else {
			System.out.println("string containes other charaters");
		}

	}

}
