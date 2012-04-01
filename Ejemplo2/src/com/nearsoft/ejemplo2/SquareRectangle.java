package com.nearsoft.ejemplo2;

public class SquareRectangle implements IShape {

	int s1, s2, s3, s4;
	
	@Override
	public double getArea() {
		return s1 * s3;
	}

	@Override
	public void setSides(int[] sides) {
		s1 = sides[0];
		s2 = sides[1];
		s3 = sides[2];
		s4 = sides[3];
	}

}
