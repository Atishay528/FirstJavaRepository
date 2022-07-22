/*3) Write a program to check if a given number is prime or not.
*/
import java.util.Scanner;

public class Handon3 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("take input number");
		num = sc.nextInt();
		boolean f=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				f=true;
				break;
			}
		}
		if(!f) {
			System.out.println(num +" prime number");
		}
		else {
			System.out.println(num +" not prime");
		}

	}

}
