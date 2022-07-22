import java.util.Scanner;

public class Handon1 {

	/*1) Write a program to print numbers from 1 to 10 in a single row with one tab space.*/
	public static void main(String[] args) {
		/*int i;
		
		for(i=1;i<=10;i++) {
			System.out.println("\t"+i);
		}*/
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("take starting input number");
		s = sc.nextInt();
		int e;
		System.out.println("take ending input number");
		e = sc.nextInt();
		for(int i=s;i<=e;i++) {
			System.out.println("\t"+i);
		
		

	}

}
}
