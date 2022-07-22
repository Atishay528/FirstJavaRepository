/*2) Write a program to print even numbers between 23 and 57.

  Each number should be printed in a separate row.*/
import java.util.Scanner;

public class Hnadon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("take starting input number");//23
		s = sc.nextInt();
		int e;
		System.out.println("take ending input number");//57
		e = sc.nextInt();
		for (int i=s;i<=e;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		

	}

}
