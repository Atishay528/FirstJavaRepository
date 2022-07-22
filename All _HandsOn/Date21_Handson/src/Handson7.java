
/*Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :

a) Reverse the elements of the Collection.

b) Iterate the elements of the TreeSet using Iterator.

c) Check if a particular element exists or not.*/


import java.util.TreeSet;
import java.util.Iterator;
public class Handson7 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet<>();
		t.add("Atishay");
		t.add("Jain");
		//Iterator it = t.iterator();
		Iterator it = t.descendingIterator();
		System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
	    
	     
		/*while(it.hasNext()){  
			   System.out.println(it.next()); 
		}
		*/
		/*String s= "Atishay";
		boolean r= false;
		while(it.hasNext()) {
			if(it.next().equals(s)) {
				r=true;
				break;
			}
		}

		if(r) {
			System.out.println("exist");
		}
		else {
			System.out.println("not exist");
		}*/
	
	}

}

