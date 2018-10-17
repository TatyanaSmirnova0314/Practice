package by.com.epam.logic;

import by.com.epam.objects.Ball;
import by.com.epam.objects.Basket;

public class FillBasket {

	Basket basket = new Basket();
	RandomValues rand = new RandomValues();
	Ball[] balls = new Ball[basket.getBasketSize()];
	String color = "blue";

	public void fillBasketWithBalls() {
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new Ball(rand.generateWeight(), rand.generateColor());
		}
	}

	public double defineBallsWeight() {
		double weightAllBalls = 0;
		for (int i = 0; i < balls.length; i++) {
			weightAllBalls += balls[i].getWeight();
		}
		System.out.println("Total weight of balls in the basket= " + weightAllBalls);
		return weightAllBalls;
	}

	public int defineAmountBlueBalls() {
		int counter = 0;
		for (int i = 0; i < balls.length; i++) {
			if (balls[i].getColor().equals(color)) {
				counter += 1;
			}
		}
		System.out.println("Total amount of blue balls in the basket= " + counter);
		return counter;
	}

}
