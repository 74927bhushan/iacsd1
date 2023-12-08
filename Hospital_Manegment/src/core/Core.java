package core;

import java.time.LocalDate;

import department.Department;

public class Core implements Comparable<Core>{

	private int Docid;
	private String DocName;
	private String Email;
	private String password;
	private String Degree;
	private LocalDate joiningDate;
	private double salary;
	private Department DeprtName;
	
	
	
	public Core(int docid, String docName, String email, String degree, LocalDate joiningDate, double salary,
			Department deprtName,String password) {
		super();
		this.password=password;
		Docid = docid;
		DocName = docName;
		Email = email;
		Degree = degree;
		this.joiningDate = joiningDate;
		this.salary = salary;
		DeprtName = deprtName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getDocid() {
		return Docid;
	}



	public void setDocid(int docid) {
		Docid = docid;
	}



	public String getDocName() {
		return DocName;
	}



	public void setDocName(String docName) {
		DocName = docName;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getDegree() {
		return Degree;
	}



	public void setDegree(String degree) {
		Degree = degree;
	}



	public LocalDate getJoiningDate() {
		return joiningDate;
	}



	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public Department getDeprtName() {
		return DeprtName;
	}



	public void setDeprtName(Department deprtName) {
		DeprtName = deprtName;
	}



	@Override
	public String toString() {
		return "Core [Docid=" + Docid + ", DocName=" + DocName + ", Email=" + Email + ", Degree=" + Degree
				+ ", joiningDate=" + joiningDate + ", salary=" + salary + ", DeprtName=" + DeprtName + "]";
	}



	@Override
	public int compareTo(Core o) {
		if (this.Docid > o.Docid) {
			 
            // if current object is greater,then return 1
            return 1;
        }
        else if (this.Docid < o.Docid) {
 
            // if current object is greater,then return -1
            return -1;
        }
 
            // if current object is equal to o,then return 0
            return 0;
	}
	
	
	
	
	
}

    