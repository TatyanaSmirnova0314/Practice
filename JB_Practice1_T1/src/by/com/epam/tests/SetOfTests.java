package by.com.epam.tests;

import org.junit.Assert;
import org.junit.Test;

import by.com.epam.logic.Formula;

public class SetOfTests {

	@Test
	public void calcFunctionXYpositive() {
		double x = 3;
		double y = 2;
		double result;
		double expectedResult = 3.3967755490944938;

		result = new Formula().calcFormula(x, y);
		Assert.assertTrue(expectedResult == result);
	}

	@Test
	public void calcFunctionXYnegative() {
		double x = -10;
		double y = -6;
		double result;
		double expectedResult = -9.909717520850897;

		result = new Formula().calcFormula(x, y);
		Assert.assertTrue(expectedResult == result);
	}

	@Test
	public void calcFunctionXYzero() {
		double x = 0;
		double y = 0;
		double result;
		double expectedResult = 0.5;

		result = new Formula().calcFormula(x, y);
		Assert.assertTrue(expectedResult == result);
	}

}
