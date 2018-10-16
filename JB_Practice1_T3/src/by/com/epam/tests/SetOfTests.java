package by.com.epam.tests;

import org.junit.Assert;
import org.junit.Test;

import by.com.epam.logic.Formula;

public class SetOfTests {
	
	@Test
	public void calcFunctionPositive() {
		
		boolean result;
		boolean expectedResult=true;
		
		Formula formula = new Formula(2, 1, 10, 2);
		
		result=formula.verifyParam(formula);
		Assert.assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void calcFunctionNegativeAmoreThanB() {
		
		boolean result;
		boolean expectedResult=false;
		
		Formula formula = new Formula(2, 100, 10, 2);
		
		result=formula.verifyParam(formula);
		Assert.assertEquals(expectedResult, result);
		
	}

	@Test
	public void calcFunctionNegativeHmoreThanAB() {
		
		boolean result;
		boolean expectedResult=false;
		
		Formula formula = new Formula(2, 1, 10, 15);
		
		result=formula.verifyParam(formula);
		Assert.assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void calcFunctionNegativeHis0() {
		
		boolean result;
		boolean expectedResult=false;
		
		Formula formula = new Formula(2, 1, 10, 0);
		
		result=formula.verifyParam(formula);
		Assert.assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void calcFunctionNegativeHlessThan0() {
		
		boolean result;
		boolean expectedResult=false;
		
		Formula formula = new Formula(2, 1, 10, -5);
		
		result=formula.verifyParam(formula);
		Assert.assertEquals(expectedResult, result);
		
	}
}
