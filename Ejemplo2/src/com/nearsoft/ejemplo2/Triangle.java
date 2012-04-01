package com.nearsoft.ejemplo2;

public class Triangle implements IShape {

	int s1, s2, s3;
	
	@Override
	public double getArea() {
		double s = (s1 + s2 + s3) / 2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}

	@Override
	public void setSides(int[] sides) {
		s1 = sides[0];
		s2 = sides[1];
		s3 = sides[3];
	}

}
