/*Write a Java program to find if the given number is palindrome or not

Example1)

I/P: 110011

O/P: 110011 is a palindrome

Example2)

I/P: 1234

O/P: 1234 is not a palindrome*/
import java.util.Scanner;

public class handon8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the number: ");  
	       int num=sc.nextInt();
	       int r,sum=0;
	       int temp=num;    
	       while(num>0)
	       {    
	       r=num%10;    
	       sum=(sum*10)+r;    
	       num=num/10;    
	       }    
	        if(temp==sum)    
	        System.out.println(temp+" is a palindrome number ");    
	        else    
	        System.out.println(temp+" is not a palindrome");
		
		

	}

}
