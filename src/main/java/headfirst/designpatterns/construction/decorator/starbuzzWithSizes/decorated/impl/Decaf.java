package headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.impl;

import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

