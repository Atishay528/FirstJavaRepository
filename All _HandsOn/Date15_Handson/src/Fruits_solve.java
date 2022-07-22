/*8) Create a base class Fruit with name ,taste and size as its attributes.

Create a method called eat() which describes the name of the fruit and its taste.

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.*/
class fruit{
	String name,taste,size;
	void eat() {
		System.out.println("fruits");
	}
}
class Apple extends fruit{
	Apple(){
		name="Apple";
		taste=" Sweet ";
	}
	void eat() {
		System.out.println(name + taste);
	}
}
class Orange extends fruit{
	Orange(){
		name="Orange";
		taste = " sweet and sour ";
	}
	void eat() {
		System.out.println(name + taste);
	}
}
public class Fruits_solve {

	public static void main(String[] args) {
		fruit f= new fruit();
		f.eat();
		Apple a = new Apple();
		a.eat();
		Orange o = new Orange();
		o.eat();
		

	}

}
