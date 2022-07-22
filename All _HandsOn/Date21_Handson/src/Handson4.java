

/*Write a program that will have a Vector which is 
 * capable of storing Employee objects. 
 * Use an Iterator and enumeration to list all 
 * the elements of the Vector.

*/
import java.util.Enumeration;
//import java.util.Iterator;
import java.util.Vector;
class Employee{
	int id;
	String name;
	String Gender;
public Employee(int id ,String name, String Gender) {
	this.id = id;
	this.name = name;
	this.Gender=Gender;
}
public int getid() {
	return id;
}
/*public String toString() {
	return "Employee [ id= "+id +",  name= "+name+", Gender= "+Gender+"]";
}*/
	
}

public class Handson4 {

	public static void main(String[] args) {
		
		Vector<Employee> v = new Vector<>();
		v.add(new Employee(101,"abc","Female"));
		v.add(new Employee(102,"xyz","male"));
		v.add(new Employee(103,"mno","Female"));
		//Iterator
		/*Iterator<Employee> it= v.iterator();
		  while(it.hasNext())

		  {
			  Employee e = it.next();
			System.out.println(e.id  + e.name + e.Gender);  
		  //System.out.println(it.next());

		  }

		 }*/
		//Enumerator
		Enumeration<Employee> e= v.elements();
		while(e.hasMoreElements()) {
			Employee e1 = e.nextElement();
			System.out.println(e1.id  + e1.name + e1.Gender);  
		}
		
		
		
		
		

	}
}



