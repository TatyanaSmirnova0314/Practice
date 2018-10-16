package by.com.epam.print;

import by.com.epam.logic.Formula;
import by.com.epam.objects.Area;
import by.com.epam.objects.Point;

public class PrintResultOfFormula {

	Formula formula = new Formula();
	
	public void printResult() {
		if (formula.pointBelongsToArea(new Point(-2, 4), new Area(10, -5, 10, -15), new Area(2, 3, 8, 12)) == true) {
			System.out.println("Specified point belongs to the shaded area");
		} else
			System.out.println("Specified point does NOT belong to the shaded area");
	}

}
