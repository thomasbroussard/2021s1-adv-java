package fr.epita.maths;

public class FactorialImplementation {
	
	
	public int calculate(int positiveInt) {
		if(positiveInt == 0 || positiveInt == 1) {
			return 1;
		}else if (positiveInt <0) {
			throw new IllegalArgumentException("input should be positive");
		}
		int result = 1;
		for (int i=1; i <= positiveInt; i++) {
			result *= i;
		}
		return result;
	}

}
