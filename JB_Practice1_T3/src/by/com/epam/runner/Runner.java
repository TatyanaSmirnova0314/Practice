package by.com.epam.runner;

import by.com.epam.logic.Formula;

public class Runner {

	public static void main(String[] args) {
		System.out.println("argument x" + "\t" + "function value" + "\n");
		Formula formula = new Formula(1, 4, 10, 8);
		formula.verifyParam(formula);
	}

}
