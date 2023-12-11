package pojos;

public class Student {
	private String firstName;
	private String lastName;
	private int score;
	private Course selectedCourse;
	private boolean admissionStatus;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, int score, Course selectedCourse) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
		this.selectedCourse = selectedCourse;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Course getSelectedCourse() {
		return selectedCourse;
	}

	public void setSelectedCourse(Course selectedCourse) {
		this.selectedCourse = selectedCourse;
	}

	public boolean isAdmissionStatus() {
		return admissionStatus;
	}

	public void setAdmissionStatus(boolean admissionStatus) {
		this.admissionStatus = admissionStatus;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", score=" + score + ", selectedCourse="
				+ selectedCourse + ", admissionStatus=" + admissionStatus + "]";
	}

}
