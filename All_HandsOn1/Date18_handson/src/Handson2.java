/*2) Write a java program that will concatenate 2 strings and return the result.

The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)

i/p:Sachin,Tendulkar

o/p:sachin tendulkar

Example2)

i/p:Mark,kate

o/p:markate*/
public class Handson2 {

	public static void main(String[] args) {
		
		
		String s = "mark,kate";
		String a[] = s.split(",");
		String s1 = a[0];
		int n1 = s1.length();
		
		String s2 = a[1];
		if(s1.charAt(n1-1)==s2.charAt(0)) {
			System.out.println((s1 + s2.substring(1)).toLowerCase());
			
		}
		else {
			System.out.println(s1.toLowerCase()+" "+s2.toLowerCase());
		}
		
		
	}

}

//TODO Auto-generated method stub
		/*String str1 = "Atishay ";
		String str2 = "Jain";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			sb.append(str2.substring(1, str2.length()));
		} else {
			sb.append(str2);
		}
		
		System.out.println(sb);		
		
		sb.append(str1);*/
		
		
		
		

