/*6) Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)

i/p:a

o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)

i/p:A

o/p:A->a
*/

import java.util.Scanner;
public class sixth_handon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Alphabhet");
		String s=sc.next();
		char ch = s.charAt(0);
		if(ch>='a'&& ch<='z') {
			System.out.println(Character.toUpperCase(ch));
		
		}
		else {
			System.out.println(Character.toLowerCase(ch));
			
		}
		

	}

}
