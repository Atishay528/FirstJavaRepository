// Write a program to initialize an array and print them in a sorted order.
public class Arrayordering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,3,4,9,0,8};
		int temp = 0;
		for (int i=0; i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
					
				}
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(" " +a[j]+ " ");
		}
	}
}
