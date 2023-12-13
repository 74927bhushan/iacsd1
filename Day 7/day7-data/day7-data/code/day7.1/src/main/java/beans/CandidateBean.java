package beans;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import dao.CandidateDaoImpl;
import pojos.Candidate;

public class CandidateBean {
//state
	private CandidateDaoImpl candidateDao;

	// def ctor
	public CandidateBean() throws SQLException {
		// create dao instance
		candidateDao = new CandidateDaoImpl();
		System.out.println("candidate bean created...");
	}

	// getter n setter
	public CandidateDaoImpl getCandidateDao() {
		return candidateDao;
	}

	public void setCandidateDao(CandidateDaoImpl candidateDao) {
		this.candidateDao = candidateDao;
	}

	// Add B.L method for top 2 candidates
	public List<Candidate> getTop2Candidates() throws SQLException {
		return candidateDao.getTop2Candidates();
	}

	// Add B.L method for party wise analysis
	public Map<String, Integer> getPartyVotes() throws SQLException{
		return candidateDao.getPartyWiseVotes();
	}

}
