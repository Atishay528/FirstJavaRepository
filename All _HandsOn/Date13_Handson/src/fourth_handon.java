/*4) Initialize a character variable in a program and

print 'Alphabhet' if the initialized value is an alphabhet,

print 'Digit' if the initialized value is a number, and

print 'Special Character', if the initialized value is anything else.*/
import java.util.Scanner;
public class fourth_handon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		char a= sc.next().charAt(0);
		
		if(a>='a' && a<='z') {
			System.out.println("alphabhet");
		}
		else if(a>='0' && a<='9') {
			System.out.println("digit");
		}
		else {
			System.out.println("special symbol");
		}
		

	}

}
