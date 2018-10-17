package by.com.epam.logic;

import java.util.Random;

public class RandomValues {
	private String colors[] = { "blue", "red", "green", "yellow", "white", "black" };
	private double[] weight = { 1.5, 2.5, 3.0, 4.0, 5.5 };
	Random random = new Random();

	public String generateColor() {
		int randColor = random.nextInt(colors.length);
		return colors[randColor];
	}

	public double generateWeight() {
		int randWeight = random.nextInt(weight.length);
		return weight[randWeight];
	}
}
