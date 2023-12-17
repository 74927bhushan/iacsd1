package dao;

import java.sql.SQLException;

import pojos.User1;

public interface user1Dao {

	User1 authenticateUser(String email,String password)throws SQLException;
	String registerNewVoter(User1 voter)throws SQLException;
	String updateVotingStatus(int voterId)throws SQLException;
	String deleteVoterDetails(String email)throws SQLException;
}
