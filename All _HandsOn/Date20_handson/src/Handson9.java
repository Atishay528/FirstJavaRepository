/*1)Write a Java program to create an ArrayList, add all the months of a year and print the same.
*/
//Array list handson


import java.util.ArrayList;
public class Handson9 {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("January");
		l1.add("Feburary");
		l1.add("March");
		l1.add("April");
		l1.add("may");
		l1.add("June");
		l1.add("July");
		l1.add("August");
		l1.add("September");
		l1.add("October");
		l1.add("November");
		l1.add("December");
		
		System.out.println("Array List elements: ");
	    for(int i=0; i < l1.size(); i++)
	      System.out.println(l1.get(i));
	   
	  }
		
		

	
}
