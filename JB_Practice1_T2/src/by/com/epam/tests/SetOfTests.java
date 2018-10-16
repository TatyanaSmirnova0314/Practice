package by.com.epam.tests;

import org.junit.Assert;
import org.junit.Test;

import by.com.epam.logic.Formula;
import by.com.epam.objects.Area;
import by.com.epam.objects.Point;

public class SetOfTests {

	@Test
	public void calcFormulaTrue() {

		Point point1 = new Point(2, 4);
		Area area1 = new Area(10, -10, 20, -20);
		Area area2 = new Area(20, -20, 31, -10);
		boolean result;
		boolean expectedResult = true;

		result = new Formula().pointBelongsToArea(point1, area1, area2);
		Assert.assertTrue(expectedResult == result);

	}

	@Test
	public void calcFormulaFalse() {

		Point point1 = new Point(150, 200);
		Area area1 = new Area(10, -10, 20, -20);
		Area area2 = new Area(20, -20, 31, -10);
		boolean result;
		boolean expectedResult = false;

		result = new Formula().pointBelongsToArea(point1, area1, area2);
		Assert.assertTrue(expectedResult == result);

	}

}
