package designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.impl;

import designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

