package by.com.epam.tests;

import org.junit.Assert;
import org.junit.Test;

import by.com.epam.logic.Massive;

public class SetOfTests {

	@Test
	public void verifyNumberNatTrue() {
		
		int x=3;
		boolean result;
		boolean expectedResult = true;
		
		result = new Massive().verifyNatNumber(x);
		Assert.assertTrue(expectedResult == result);
	}
	
	@Test
	public void verifyNumberNatFalse() {
		
		int x=4;
		boolean result;
		boolean expectedResult = false;
		
		result = new Massive().verifyNatNumber(x);
		Assert.assertTrue(expectedResult == result);
	}
	
	@Test
	public void verifyNumberIs0() {
		
		int x=0;
		boolean result;
		boolean expectedResult = false;
		
		result = new Massive().verifyNatNumber(x);
		Assert.assertTrue(expectedResult == result);
	}
	
	@Test
	public void verifyNumberIs1() {
		
		int x=1;
		boolean result;
		boolean expectedResult = false;
		
		result = new Massive().verifyNatNumber(x);
		Assert.assertTrue(expectedResult == result);
	}
}
