package dao;

import java.sql.SQLException;

import pojos.User;

public interface UserDao {
//add a method for user login
	User authenticateUser(String email, String password) throws SQLException;
	//add a method for voter registration
	String registerNewVoter(User voter) throws SQLException;
	//add a method to update voting status 
	String updateVotingStatus(int voterId) throws SQLException;
	//add a method to delete voter details
	String deleteVoterDetails(String email) throws SQLException;
}
