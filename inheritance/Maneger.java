package inheritance;

public class Maneger extends Emp{
	
	int mgrid;
	String mgrName;

	public Maneger(int empid, String ename, int mgrid, String mgrName) {
		super(empid, ename);
		this.mgrid = mgrid;
		this.mgrName = mgrName;
	}

	
	
	public void disMgr() {
		System.out.println("this is maneger specific method i.e. sub class method");
	}
	
	
	
	

}
