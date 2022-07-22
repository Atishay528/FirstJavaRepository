package Java_output;

public class Employee extends Person {

private double salary;
private int year;
private String insurence;
Employee(String name, double salary, int year, String insurence){
	super(name);
	this.salary = salary;
	this.year= year;
	this.insurence= insurence;
	
}

	public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getInsurence() {
	return insurence;
}

public void setInsurence(String insurence) {
	this.insurence = insurence;
}

public String toString() {
    return "Employee [Salary=" + salary + ", yearJoining=" + year + ", Insurance="
            + insurence + ", name=" + name + "]";
}


}
