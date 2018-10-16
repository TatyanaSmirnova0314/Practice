package by.com.epam.logic;

public class Formula {

	double x;
	double y;
	double num;
	double denom;
	double result;

	public double calcNum(double x, double y) {
		num = 1 + (Math.pow((Math.sin(x + y)), 2));
		return num;
	}

	public double calcDenom(double x, double y) {
		denom = 2 + Math.abs(x - (2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2))));
		return denom;
	}

	public double calcFormula(double x, double y) {
		result = calcNum(x, y) / calcDenom(x, y) + x;
		return result;
	}

}
