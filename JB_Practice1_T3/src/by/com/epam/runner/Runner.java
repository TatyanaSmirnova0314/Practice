package by.com.epam.runner;

import by.com.epam.logic.Formula;

public class Runner { 

	public static void main(String[] args) {
		System.out.println("argument x" + "\t" + "function value" + "\n");
		Formula formula = new Formula(1, 2, 10, 2);
		formula.verifyParam(formula);
	}

}
