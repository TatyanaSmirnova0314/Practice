package by.com.epam.logic;

import java.util.Random;

public class Massive {

	private int[] mass;
	private int massSize = 10;

	public int[] generateMass() {
		if (massSize < 0) {
			System.out.println("Error: array size cannot be negative");
			System.exit(1);
		}
		mass = new int[massSize];
		System.out.println("Integer sequence:");
		for (int i = 0; i < massSize; i++) {
			mass[i] = new Random().nextInt(8);
			System.out.println(mass[i]);
		}
		return mass;
	}

	public boolean verifyNatNumber(int x) {
		boolean flag = true;
		if (x <= 1) {
			flag = false;
		}
		for (int j = 2; j < x; j++) {
			if (x % j == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public void printResult() {
		System.out.println("Array from elements of natural numbers:");
		for (int i = 0; i < massSize; i++) {
			if (verifyNatNumber(mass[i]) == true) {
				System.out.println(i);
			}
		}
	}

}
