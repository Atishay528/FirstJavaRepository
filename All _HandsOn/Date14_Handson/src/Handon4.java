/*4) Write a program to print prime numbers between 10 and 99.

*/
import java.util.Scanner;

public class Handon4 {

	public static void main(String[] args) {
		int l;
		Scanner sc = new Scanner(System.in);
		System.out.println("take input number 1");
		l = sc.nextInt();
		int h;
		System.out.println("take input number 2");
		h = sc.nextInt();
        while (l < h) {
            boolean flag = false;
            for(int i = 2; i <= l/2; i++) {
                if(l % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(l+ " ");

            ++l;
        }

	}

}
