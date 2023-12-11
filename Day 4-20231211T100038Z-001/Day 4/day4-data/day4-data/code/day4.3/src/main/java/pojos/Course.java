package pojos;

public enum Course {
	JAVA(80), MERN(84), NET(89), DBT(70);
	private int minScore;

	private Course(int minScore) {
		//super(name(),ordinal());
		this.minScore = minScore;
	}

	public int getMinScore() {
		return minScore;
	}
	
	
}
