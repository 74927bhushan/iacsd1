package validate_speed;

public class ValidateSpeed {

	public static final int Min_speed;
	public static final int Max_speed;
	
	static {
	Min_speed=40;
	Max_speed=130;
}
	
	public static void validateSpeed(int Speed) throws SpeedOutofRangeException{
		if(Speed <= Min_speed) {
			throw new SpeedOutofRangeException("you are driving too slow please speed up ");
		}
		if(Speed >= Max_speed) {
			throw new SpeedOutofRangeException("You ARE DRIVING TOO FAST PLEASE SLOW DOWN FATAL!!!!");
		}
		System.out.println(" Your Speed is ok please continue to drive ");
	}
	
}