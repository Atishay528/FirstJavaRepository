class A{
	A(){
		System.out.println("Base Class");
	}
	void m1() {
		System.out.println("method 1 in base class");
	}
}
public class Single_inheri extends A {
	Single_inheri(){
		System.out.println("child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_inheri s= new Single_inheri();
		s.m1();
		

	}

}
