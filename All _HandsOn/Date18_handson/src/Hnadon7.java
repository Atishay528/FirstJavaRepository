/*
7) Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.

If the input is "xHix", then output is "Hi".

If the input is "America", then the output is "America"*/
import java.util.Scanner;

public class Hnadon7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		if(s1.startsWith("x") &&  s1.endsWith("x"))
				{
			int s2 = s1.length()-1;
			for(int i=1; i<s2; i++) {
				System.out.print(s1.charAt(i));
				//System.out.print(s1.substring(1,(s1.length()-1)));
			}
			
		}
		else {
			System.out.println(s1);
			
		}
	}

}
