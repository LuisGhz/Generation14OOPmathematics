package com.exercise14oopmathematics.model;

public class MathematicsOperation {
	
	public final static double PI = 3.1416;
	
	public static double areaTriangle(double base, double height) {
		return (base * height) / 2;
	}
	
	public double areaSquare(double side) {
		return side * 2;
	}
	
	public double areaCircle(double radio) {
		return this.PI * (radio * radio);
	}
}
