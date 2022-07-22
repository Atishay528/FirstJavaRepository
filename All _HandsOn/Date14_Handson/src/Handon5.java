/*Write a program to print the sum of all the digits of a given number.

Example1)

I/P:1234

O/P:10
*/
import java.util.Scanner;

public class Handon5 {

	public static void main(String[] args) {
		int l;
		Scanner sc = new Scanner(System.in);
		System.out.println("take input number");
		l = sc.nextInt();
		int sum=0;
		while (l!=0) {
			int lastdigit = l%10;
			sum+=lastdigit;
			l/=10;
		}
		System.out.println(sum);
		
		

	}

}
