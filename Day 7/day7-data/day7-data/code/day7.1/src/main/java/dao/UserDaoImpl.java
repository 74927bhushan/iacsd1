package dao;

import java.sql.*;
import static utils.DBUtils.*;

import pojos.User;

public class UserDaoImpl implements UserDao {
	// state
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3,pst4;

	// def ctor
	public UserDaoImpl() throws SQLException {
		// establish cn
		cn = openConnection();
		// pst1 : for signin
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
		// pst2 : signup
		pst2 = cn.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		// pst3 : update
		pst3 = cn.prepareStatement("update users set status=? where id=?");
		//pst4 : delete
		pst4=cn.prepareStatement("delete from users where email=?");
		System.out.println("user dao created !");
	}

	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		// set IN params : 2
		pst1.setString(1, email);
		pst1.setString(2, password);
		// exec query
		/*
		 * int userId, String firstName, String lastName, String email, String password,
		 * Date dob, boolean votingStatus, String role
		 */
		try (ResultSet rst = pst1.executeQuery()) {
			System.out.println("executing select query....");
			if (rst.next())
				// ORM : done by prog using JDBC
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), email, password, rst.getDate(6),
						rst.getBoolean(7), rst.getString(8));
		}
		return null;
	}

	/*
	 * first_name | last_name | email | password | dob | status | role
	 */
	@Override
	public String registerNewVoter(User voter) throws SQLException {
		// set IN params
		pst2.setString(1, voter.getFirstName());
		pst2.setString(2, voter.getLastName());
		pst2.setString(3, voter.getEmail());
		pst2.setString(4, voter.getPassword());
		pst2.setDate(5, voter.getDob());
		pst2.setBoolean(6, false);
		pst2.setString(7, "voter");
		// exec method : execUpdate
		int rowCount = pst2.executeUpdate();
		if (rowCount == 1)
			return "New voter details inserted....";
		return "Voter details not inserted....";
	}

	@Override
	public String updateVotingStatus(int voterId) throws SQLException {
		// set IN params
		pst3.setBoolean(1, true);
		pst3.setInt(2, voterId);
		// exec update
		int rowCount = pst3.executeUpdate();
		if (rowCount == 1)
			return "voting status updated!";
		return "Status updation failed!!!!!";
	}
	

	@Override
	public String deleteVoterDetails(String email) throws SQLException {
		// set IN param
		pst4.setString(1, email);
		//exec update : DML
		int rowCount = pst4.executeUpdate();
		if (rowCount == 1)
			return "voter details deleted....";
		return "Deletion failed!!!!!";
	}

	// add a cleanup method : to clean up the resources
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();
		closeConnection();
		System.out.println("user dao cleaned up....");
	}

}
