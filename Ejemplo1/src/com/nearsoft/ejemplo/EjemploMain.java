package com.nearsoft.ejemplo;

import java.util.Scanner;

public class EjemploMain {

	public static void main(String[] args) {
		int[] numbers = readNumbers();
		double area = 0;
		switch (numbers.length) {
		case 1:
			area = getForCircle(numbers);
			break;
		case 3:
			area = getForTriangle(numbers);
			break;
		case 4:
			area = getForSquareOrRectangle(numbers);
		}
		System.out.format("%.3f%n", area);
	}
	
	static double getForCircle(int[] numbers){
		return Math.PI * (Math.pow(numbers[0], 2));
	}
	
	static double getForTriangle(int[] numbers){
		double s = (numbers[0] + numbers[1] + numbers[2]) / 2;
		return Math.sqrt(s * (s - numbers[0]) * (s - numbers[1]) * (s - numbers[2]));
	}
	
	static double getForSquareOrRectangle(int[] numbers){
		return numbers[0] * numbers[1];
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
