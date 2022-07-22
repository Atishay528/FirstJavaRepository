//ArrayHandson
/* Create an ArrayList that can store only Strings.

Create a printAll method that will print all the elements of the ArrayList using an Iterator.*/
import java.util.ArrayList;
import java.util.Iterator;
public class Handon10 {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Car");
		l1.add("Doctor");
		l1.add("Elephant");
		System.out.println(l1);
		printAll(l1);
		

	}
	public static void printAll(ArrayList l1) {
		 Iterator<String> it = l1.iterator();
		 while (it.hasNext())
		 System.out.println( it.next());


	}

}
