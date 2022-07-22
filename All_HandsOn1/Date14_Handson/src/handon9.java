/*10) Write a program to print first 5 values which are divisible by 2, 3, and 5.*/
import java.util.Scanner;

public class handon9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("take starting input number");
		s = sc.nextInt();
		int count=0;
		while(count!=5) {
			if(s%2==0 && s%3==0 && s%5==0) {
				System.out.println(s);
				count++;
			}
			s++;
		}
				
			
			
		

	}

}
