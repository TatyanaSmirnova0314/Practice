package by.com.epam.logic;

public class Formula {

	private double function;
	private double x;
	private double a;
	private double b;
	private double h;
	private boolean result;

	public Formula(double x, double a, double b, double h) {
		this.x = x;
		this.a = a;
		this.b = b;
		this.h = h;
	}

	public double calcFormula() {
		function = Math.tan(x);
		return function;
	}

	public void calcResult(boolean result) {
		if (result = true) {
			for (x = a; x < b; x = x + h) {
				System.out.println(x + "\t" + "\t" + calcFormula());
			}
		}
	}

	public boolean verifyParam(Formula formula) {
		if (a < b) {
			if (h < b - a) {
				if (h > 0) {
					result = true;
					calcResult(result);
				} else {
					result = false;
					System.out.println("Error: 'h' cannot be '0' or less than '0'");
				}
			} else {
				result = false;
				System.out.println("Error: 'h' should be less than 'b-a'");
			}
		} else {
			result = false;
			System.out.println("Error: 'a' should be less than 'b'");
		}
		return result;
	}

}
