package com.nearsoft.ejemplo2;

public class Circle implements IShape {

	int radius;
	
	@Override
	public double getArea() {
		return Math.PI * (Math.pow(radius, 2));
	}

	@Override
	public void setSides(int[] sides) {
		radius = sides[0];
	}

}
