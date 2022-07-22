/*2) Write a program to check if a given integer number is odd or even.*/
import java.util.Scanner;

public class second_handon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("take input number");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}

	}

}
