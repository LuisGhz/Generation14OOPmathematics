package com.exercise14oopmathematics.app;

import com.exercise14oopmathematics.model.MathematicsOperation;
import java.util.Scanner;

public class MathematicsApp {
	public static void main(String... args) {
		//variables declaration
		double base = 0;
		double height = 0;
		double radio = 0;
		double side = 0;
		double result = 0;
		
		//objects construction
		Scanner kInput = new Scanner(System.in);
		//MathematicsOperation myOper = new MathematicsOperation();
		
		System.out.println("Input the base");
		base = kInput.nextDouble();
		System.out.println("Input the height");
		height = kInput.nextDouble();
		//result = myOper.areaTriangle(base, height);
		result = MathematicsOperation.areaTriangle(base, height);
		System.out.println("The result is: " + result);
		System.out.println(MathematicsOperation.PI);
		
	}
}
