//Write a Program to check whether a given String is Palindrome or not.
public class Handon1 {
	public static void main(String[] args) {
		String s = "naman";
		String rs = "";
		int strlen = s.length();
		for(int i = strlen - 1;  i>=0; i-- ) {
			rs = rs + s.charAt(i);
			
		}
		if(s.equals(rs)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
