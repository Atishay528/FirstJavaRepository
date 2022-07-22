/*4) Write a java program that will return the first half of the string, if the length of the string is even.

It should return null for odd length string.

Example1)

i/p:TomCat

o/p:Tom

Example2)

i/p:Apron

o/p:null*/

import java.util.*;
public class Handon4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = null;
		int s1len = s1.length();
		int n= s1len/2;
		if(s1len%2==0) {
			s2 = "";
			for(int i =0;i<n;i++) {
				s2= s2 + s1.charAt(i);
			}
			System.out.println(s2);
		
		}
		else {
			System.out.println(s2);
		}
		

	}

}
