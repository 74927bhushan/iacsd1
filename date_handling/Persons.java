package date_handling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persons {

	private String pname;
	private Date dob;
	
	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public Persons(String pname, Date dob) {
		super();
		this.pname = pname;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Persons [pname=" + pname + ", dob=" + dob + "]";
	}

	public String getPname() {
		return pname;
	}

	public Date getDob() {
		return dob;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	
	
}
