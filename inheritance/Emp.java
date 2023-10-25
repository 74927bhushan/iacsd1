package inheritance;

public class Emp {
	int empid;
	String ename;
	
	public void display() {
		System.out.println("this is employee class i.e. super class");
	}

	public Emp(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}

}
