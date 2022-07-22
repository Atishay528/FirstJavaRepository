

/* 2) Create an abstract class Compartment to represent a 
rail coach. Provide an abstract function notice in this class.



public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of compartment.

Create a class TestCompartment.Write main function to do the following:

Declare an array of Compartment of size 10.

Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.

Check the polymorphic behavior of the notice method.

[i.e based on the random number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]*/import java.util.*;
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice() {
		return "you are in first class campartment";
	}
}
class Ladies extends Compartment{
	public String notice () {
		return "you are in ladies comaprtment";
	}
}
class General  extends Compartment{
	public String notice () {
		return "you are in general compartment";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "this is luggage compartment";
	}
	
}
public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] c1 = new Compartment[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
    		int randomNum = r.nextInt((4 - 1) + 1) + 1;
    	
    		if (randomNum == 1)
    			c1[i] = new Luggage();
    		else if (randomNum == 2)
    			c1[i] = new Ladies();
    		else if (randomNum == 3)
    			c1[i] = new General();
    		else if (randomNum == 4)
    			c1[i] = new FirstClass();
    	
    		System.out.println(c1[i].notice());
    	}

	}

}

/*import java.util.*;



public class TestCompartment {

public static void main(String[] args) {

 Compartment c[]=new Compartment[10];

 Scanner sc=new Scanner(System.in);

 int n=0;

 for(int i=0;i<10;i++) {

 System.out.println("Enter a random Number 1-4: ");

 n=sc.nextInt();

 if(n==1) {

  c[i]=new FirstClass();

  System.out.println(c[i].notice());

 }

 else if(n==2) {

  c[i]=new Ladies();

  System.out.println(c[i].notice());

 }

 else if(n==3) {

  c[i]=new General();

  System.out.println(c[i].notice());

 }

 else if(n==4) {

  c[i]=new Luggage();

  System.out.println(c[i].notice());

 }

 else {

  System.out.println("invalid");

 }

 }

}

}*/