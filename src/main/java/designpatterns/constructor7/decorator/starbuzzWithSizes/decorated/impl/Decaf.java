package designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.impl;

import designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

