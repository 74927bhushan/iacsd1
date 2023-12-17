package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static utils.Connection1.openconnection;

import static utils.Connection1.closeConnection;
import pojos.User1;

public class UserDaoImpl implements user1Dao{
	
	private Connection cn;
	private PreparedStatement pst1,pst2,pst3,pst4;
	
	public UserDaoImpl()throws SQLException{
		cn=openconnection();
		pst1=cn.prepareStatement("select * from users where email=? and password=?");
		pst2=cn.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		pst3=cn.prepareStatement("update users set status=? where id=?");
		pst4=cn.prepareStatement("delete from users where email=?");
		System.out.println("user dao created");
	}

	@Override
	public User1 authenticateUser(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		pst1.setString(1, email);
		pst1.setString(2, password);
		
		try(ResultSet rst = pst1.executeQuery()){
			if(rst.next())
				return new User1(rst.getInt(1),rst.getString(2),rst.getString(3),email,password,rst.getDate(6),rst.getBoolean(7),rst.getString(8));
		}
		return null;
//int userid, String f_name, String l_name, String email, String password, Date dob,
		//boolean votingStatus, String role)
	}

	@Override
	public String registerNewVoter(User1 voter) throws SQLException {
		// TODO Auto-generated method stub
		pst2.setString(1, voter.getF_name());
		pst2.setString(2, voter.getL_name());
		pst2.setString(3, voter.getEmail());
		pst2.setString(4, voter.getPassword());
		pst2.setDate(5, voter.getDob());
		pst2.setBoolean(6, false);
		pst2.setString(7, "voter");
		
		int rowCount = pst2.executeUpdate();
		if(rowCount==1)
			return "new voter details inserted";

		return "voter details not inserted";
	}

	@Override
	public String updateVotingStatus(int voterId) throws SQLException {
		// TODO Auto-generated method stub
		pst3.setBoolean(1, true);
		pst3.setInt(2, voterId);
		int rowCount = pst3.executeUpdate();
		if(rowCount ==1)
			return "voting status updated";
		
		return "status updation failed";
	}

	@Override
	public String deleteVoterDetails(String email) throws SQLException {
		// TODO Auto-generated method stub
		pst4.setString(1, email);
		int rowCount =pst4.executeUpdate();
		if(rowCount ==1)
			return "voter details deleted";
		
		return "deletion failed";
		
	}
	

	public void cleanup() throws SQLException{
		if (pst1!=null)
			pst1.close();
		if(pst2 !=null)
			pst2.close();
		if(pst3 != null)
			pst3.close();
		if(pst4 !=null)
			pst4.close();
		
		closeConnection();
		System.out.println("user dao cleaned up");
		
	}
	
}
