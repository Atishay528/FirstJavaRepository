
/*3) Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e*/
import java.util.Scanner;
public class third_handon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st character/alphabhet");
	char a = sc.next().charAt(0);
	System.out.println("enter 2nd character/alphabhet");
	char b = sc.next().charAt(0);
	if (a>b) {
		System.out.println(b+","+a);
	}
	else {
		System.out.println(a+","+b);
	}

	}

}
