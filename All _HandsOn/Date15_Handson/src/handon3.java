/*3) Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.

Name of the class - Patient

Member Variables - patientName(String),height(double),weight(double)

Member Function - double computeBMI()

The above method should compute the BMI and return the result. The formula for computation of BMI is weight (in kg) ÷ height*height(in metres).

Create an object of the Patient class and check the results.*/

public class handon3 {
String patientname;
double height;
double w;
handon3(String patientname, double heigth, double weight){
	this.patientname=patientname;
	this.height=heigth;
	this.w=weight;
}
double computeBMI() {
	return (w/(height*height))*703;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		handon3 h = new handon3("ram",12,15);
		System.out.println(h.computeBMI());

	}

}
