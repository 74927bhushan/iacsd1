package mess_Core;

public enum Plan {

	MONTHLY(2000), QUARTERLY(5000), HALFYEARLY(8000), YEARLY(12000);

	double finalamount;

	private Plan(double finalamount) {
		this.finalamount = finalamount;
	}

	public double getFinalamount() {
		return finalamount;
	}

	public void setFinalamount(double finalamount) {
		this.finalamount = finalamount;
	}

}
