/*3) Given a string, return a new string made of 'n' copies of the first 2 chars of the original string

where 'n' is the length of the string.

Example1)

i/p:Hello

o/p:HeHeHeHeHe*/
public class Handon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "";
		int n= s1.length();
		String k = s1.substring(0,2);
		for(int i=0; i<=n;i++) {
			k=k+s2;
			System.out.print(k);
			
		}
		

	}

}
