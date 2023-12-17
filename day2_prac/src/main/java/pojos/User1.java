package pojos;

import java.sql.Date;

public class User1 {

	private int userid;
	private String f_name;
	private String l_name;
	private String email;
	private String password;
	private Date dob;
	private boolean votingStatus;
	private String role;
	public User1() {
		
	}
	public User1(int userid, String f_name, String l_name, String email, String password, Date dob,
			boolean votingStatus, String role) {
		super();
		this.userid = userid;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.votingStatus = votingStatus;
		this.role = role;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isVotingStatus() {
		return votingStatus;
	}
	public void setVotingStatus(boolean votingStatus) {
		this.votingStatus = votingStatus;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User1 [userid=" + userid + ", f_name=" + f_name + ", l_name=" + l_name + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", votingStatus=" + votingStatus + ", role=" + role + "]";
	}
	
}
