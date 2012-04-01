package com.nearsoft.ejemplo2;

public class ShapeFactory {
	private static ShapeFactory _instance;

	static {
		_instance = new ShapeFactory();
	}

	private ShapeFactory() {
	}

	public static ShapeFactory getInstance() {
		return _instance;
	}

	public IShape getShape(int[] sides) {
		IShape shape = null;
		switch (sides.length) {
		case 1:
			shape = new Circle();
			break;
		case 3:
			shape = new Triangle();
			break;
		case 4:
			shape = new SquareRectangle();
			break;
		default:
			throw new IllegalArgumentException("Unknown shape");
		}
		shape.setSides(sides);
		return shape;
	}
}