package by.com.epam.runner;

import by.com.epam.logic.Massive;

public class Runner {

	public static void main(String[] args) {

		Massive mass = new Massive();
		mass.generateMass();
		mass.printResult();
	}

}
