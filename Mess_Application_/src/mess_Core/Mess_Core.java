package mess_Core;

import java.time.LocalDate;

public class Mess_Core {

	private int custid;
	private String f_Name;
	private String L_Name;
	 String Email;
	private double amount;
	private Plan messplan;
	private LocalDate reg_Date;

	public Mess_Core(int custid, String f_Name, String l_Name, String email, double amount, Plan messplan,
			LocalDate reg_Date) {
		
		this.custid = custid;
		this.f_Name = f_Name;
		L_Name = l_Name;
		Email = email;
		this.amount = amount;
		this.messplan = messplan;
		this.reg_Date = reg_Date;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	public String getL_Name() {
		return L_Name;
	}

	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Plan getMessplan() {
		return messplan;
	}

	public void setMessplan(Plan messplan) {
		this.messplan = messplan;
	}

	public LocalDate getReg_Date() {
		return reg_Date;
	}

	public void setReg_Date(LocalDate reg_Date) {
		this.reg_Date = reg_Date;
	}

	@Override
	public String toString() {
		return "Mess_Core [custid=" + custid + ", f_Name=" + f_Name + ", L_Name=" + L_Name + ", Email=" + Email
				+ ", amount=" + amount + ", messplan=" + messplan + ", reg_Date=" + reg_Date + "]";
	}

}
