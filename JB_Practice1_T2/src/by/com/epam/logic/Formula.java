package by.com.epam.logic;

import by.com.epam.objects.Area;
import by.com.epam.objects.Point;

public class Formula {

	boolean result;

	public boolean pointBelongsToArea(Point point1, Area area1, Area area2) {
		if (point1.getCoordinateX() > area1.getCoordinateX2() & point1.getCoordinateX() < area1.getCoordinateX1()
				|| point1.getCoordinateX() > area2.getCoordinateX2()
						& point1.getCoordinateX() < area2.getCoordinateX1()) {
			if (point1.getCoordinateY() > area1.getCoordinateY2() & point1.getCoordinateY() < area1.getCoordinateY1()
					|| point1.getCoordinateY() > area2.getCoordinateY2()
							& point1.getCoordinateY() < area2.getCoordinateY1()) {
				return result = true;
			}
			return result = false;

		}
		result = false;
		return result;
	}

}
