package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import pojos.Candidate;
import static utils.DBUtils.*;

public class CandidateDaoImpl implements CandidateDao {
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3, pst4;

	public CandidateDaoImpl() throws SQLException {
		// open cn
		cn = openConnection();
		pst1 = cn.prepareStatement("select * from candidates");
		pst2 = cn.prepareStatement("update candidates set votes=votes+1 where id=?");
		pst3 = cn.prepareStatement("select party,sum(votes) from candidates group by party");
		pst4 = cn.prepareStatement("select * from candidates order by votes desc limit 2");
		System.out.println("candidate dao created....");
	}

	@Override
	public List<Candidate> getAllCandidates() throws SQLException {
		List<Candidate> candidateList = new ArrayList<>();
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				candidateList.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
		}
		return candidateList;
	}

	@Override
	public String incrementCandidateVotes(int candidateId) throws SQLException {
		// set IN param : candidate id
		pst2.setInt(1, candidateId);
		int updateCount = pst2.executeUpdate();
		if (updateCount == 1)
			return "Votes updated...";
		return "Votes updation failed !!!!!!!!!!!!";
	}

	@Override
	public Map<String, Integer> getPartyWiseVotes() throws SQLException {
		// ordered map
		Map<String, Integer> map = new LinkedHashMap<>();
		try (ResultSet rst = pst3.executeQuery()) {
			while (rst.next())
				map.put(rst.getString(1), rst.getInt(2));
		}
		return map;
	}

	@Override
	public List<Candidate> getTop2Candidates() throws SQLException {
		List<Candidate> list = new ArrayList<>();
		try (ResultSet rst = pst4.executeQuery()) {
			while (rst.next())
				list.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
		}
		return list;
	}

	// clean up
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
	}

}
