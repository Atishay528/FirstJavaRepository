/*1) Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.
*/
public class Box {
int h,w,d;
Box(int height,int width,int depth){
	this.h=height;
	this.w=width;
	this.d=depth;

}
int volume(){
return h*w*d;

	
}
	public static void main(String[] args) {
		Box b=new Box(10,20,30);
		System.out.println(b.volume());
		// TODO Auto-generated method stub

	}

}
