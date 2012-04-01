package com.nearsoft.ejemplo2;

import java.util.Scanner;

public class EjemploMain {

	public static void main(String[] args) {
		int[] numbers = readNumbers();
		IShape shape = ShapeFactory.getInstance().getShape(numbers);
		double area = shape.getArea();
		System.out.format("%.3f%n", area);
	}
	
	static int[] readNumbers() {
		Scanner scanner = new Scanner(System.in);
		String input;
		String[] sNumbers;
		int[] iNumbers;
		System.out
				.println("Escribe los lados de la figura separados por comas");
		input = scanner.nextLine();
		scanner.close();
		sNumbers = input.split(",");
		iNumbers = new int[sNumbers.length];
		for (int i = 0; i < iNumbers.length; i++) {
			iNumbers[i] = Integer.parseInt(sNumbers[i].trim());
		}
		return iNumbers;
	}

}
