/*
4)Create a class named ‘Animal’ which includes methods like eat() and sleep().



Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/

class Animal{
	public void eat() {
		System.out.println("eat method");
	}
	public void sleep() {
		System.out.println("sleep method");
	}
}
class Bird extends Animal{
	 
    public void eat() {
        super.eat();
			System.out.println("override eat method in child");
		}
	
    public void sleep() {
    	super.sleep();
    		System.out.println("override sleep method in child");
    	
    }
	
	void fly() {
		System.out.println("fly methdo");
	}
}
public class handon4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Bird b = new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();

	}

}
