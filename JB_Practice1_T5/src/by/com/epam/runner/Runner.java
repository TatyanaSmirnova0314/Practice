package by.com.epam.runner;

import by.com.epam.logic.FillBasket;

public class Runner {

	public static void main(String[] args) {

		FillBasket myBasket = new FillBasket();
		myBasket.fillBasketWithBalls();
		myBasket.defineBallsWeight();
		myBasket.defineAmountBlueBalls();
	}

}
