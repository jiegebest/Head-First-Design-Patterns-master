package headfirst.designpatterns.decorator.starbuzzWithSizes.decorated.impl;

import headfirst.designpatterns.decorator.starbuzzWithSizes.decorated.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

