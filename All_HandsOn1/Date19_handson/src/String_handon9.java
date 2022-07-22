/* Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.

Any characters left, will go to the end of the result.

Example1)

i/p:Hello,World

o/p:HWeolrllod*/
public class String_handon9 {
	 public static void main(String[] args)
	 {
		 String s1 = "Hello";
		 String s2 = "World";
		 String s3 = "";
		 
		 for(int i=0;i<s1.length()|| i<s2.length();i++) {
			 s3+=s1.charAt(i);
			 s3+=s2.charAt(i);
		 
		 }
			System.out.println(s3);
		 
}
}
