package headfirst.designpatterns.decorator.starbuzz.decorated.impl;

import headfirst.designpatterns.decorator.starbuzz.decorated.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

