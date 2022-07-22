/*1) Write a program to check if a given integer number is Positive, Negative, or Zero.*/
import java.util.Scanner;

public class one_handon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("take input number");
		num = sc.nextInt();
		if (num>0) {
			System.out.println("Positive number");
		}
		else if(num<0) {
			System.out.println("Negative number");
		}
		else {
			System.out.println("number is zero");
		}


	}

}
