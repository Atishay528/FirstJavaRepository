/*3) i) Create the following class and implement the method to check whether the given

string is a palindrome and return the result.

Class Name : Demo2

Method : palindromeCheck(String):boolean

(Hint: A String is palindrome, If the reversed string is equal to the actual string.

 Ex: madam, mom, dad, malayalam )

ii) Create a Junit test class to test the above class.*/

public class Handson3 {
public boolean palindromeCheck(String a) {
	String s = "madam";
	int digitCount = s.length();
	boolean isPalindrome = true;
	int r = digitCount/2;
	if(digitCount%2==0)
		r--;
	for(int i=0;i<=r;i++) {
		if(s.charAt(i)!=s.charAt(digitCount-i-1))
			isPalindrome = false;
		
	}
	return isPalindrome;
	
}
}
