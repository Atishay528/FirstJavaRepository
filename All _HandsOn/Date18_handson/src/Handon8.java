/*8) Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)

i/p:ab*cd

o/p:ad*/
import java.util.Scanner;

public class Handon8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int s2=s1.length();
		String s3="";
		for(int i =0;i<s2;i++) {
			if(s1.charAt(i)=='*') {
				s3 = s3.substring(0,i-1);
				i++;
				
			}
			else {
				s3+=s1.charAt(i);
						
			}
		}
		System.out.println(s3);

	}

}
