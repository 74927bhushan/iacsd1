package beans;

import java.sql.SQLException;

import dao.UserDaoImpl;
import pojos.User;

public class UserBean {
	// clnt' s state
	private String email;
	private String password;
//dependency : user dao
	private UserDaoImpl userDao;
	// user details : User pojo
	private User userDetails;
	//add a property to store a message
	private String message;
	//def ctor will be invoked by WC -- triggered by jsp:useBean
	public UserBean() throws SQLException{
		// create user dao instance
		userDao=new UserDaoImpl();
		System.out.println("user bean created...");
	}
	//getters n setters : generate all
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
	public UserDaoImpl getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	public User getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}
	
	public String getMessage() {
		return message;
	}
	//add B.L method for user's authentication + role based authorization
	public String validateUser() throws SQLException
	{
		System.out.println("in validate user "+email+" "+password);
		//invoke dao's method
		userDetails=userDao.authenticateUser(email, password);
		//null chking
		if(userDetails==null) {
			message="Invalid Login , Please retry!!!!!";					
			return "login";
		}
		message="Login Successful!";
		//=> auth successful --> proceed to role based auth
		if(userDetails.getRole().equals("admin"))
			return "admin_page";
		//=> voter
		if(userDetails.isVotingStatus())
			return "logout";
		//=> voter , not yet voted
		return "candidate_list";					
	}
	
	
}
