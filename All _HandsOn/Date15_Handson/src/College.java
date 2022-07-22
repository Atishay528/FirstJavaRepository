/*
7) Create a school application with a class called Person. Create name and dateOfBirth as member variables.

Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.

Create a class called Student that inherits from Person class. This class will have a member variable called studentId.

Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.

Create objects of each of this classes, invoke and test the methods that are available in these classes.
*/

class P1{
	String name;
	String DOB;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
}

class Teacher extends P1 {
	int salary;
	String subject;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
		
		
	}
	
class Student extends P1{
	int sid;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	
}
public class College extends Student {
	String college_name;
	String year;
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	


	public static void main(String[] args) {
		College c = new College();
		c.setName("Atishay");
		c.setDOB("26/06/2002");
		c.setYear("4th year");
		c.setCollege_name("JEC");
		c.setSid(101);
		
		System.out.println(c.getName());
		System.out.println(c.getDOB());
		System.out.println(c.getYear());
		System.out.println(c.getCollege_name());
		System.out.println(c.getSid());

	}

}
