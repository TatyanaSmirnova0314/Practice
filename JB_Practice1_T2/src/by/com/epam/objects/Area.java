package by.com.epam.objects;

public class Area {

	private double coordinateX1;
	private double coordinateX2;
	private double coordinateY1;
	private double coordinateY2;

	public Area(double x1, double x2, double y1, double y2) {
		this.coordinateX1 = x1;
		this.coordinateX2 = x2;
		this.coordinateY1 = y1;
		this.coordinateY2 = y2;
	}

	public double getCoordinateX1() {
		return coordinateX1;
	}
	
	public double getCoordinateX2() {
		return coordinateX2;
	}
	
	public double getCoordinateY1() {
		return coordinateY1;
	}
	
	public double getCoordinateY2() {
		return coordinateY2;
	}
	
}
