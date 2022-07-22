/*6) Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi"*/
public class Handon6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hi";
		String s2 = "hello";
		if(s2.length()>s1.length()) {
			System.out.println(s1+s2+s1);
		}
		
		
		

	}

}
