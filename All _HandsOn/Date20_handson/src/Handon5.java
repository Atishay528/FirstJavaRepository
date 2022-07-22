/*Write a Program with a division method which receives two integer 
 and performs the division operation.

The method should declare that it throws ArithmeticException. 
This exception should be handled in the main method.*/
import java.util.*;
public class Handon5 {
 static int division(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
try {
	
	int c = division(a,b);
	System.out.println("value of c = " + c);
	
}
catch(ArithmeticException e) {
	System.out.println("ArithmeticException");
}


	}

}
