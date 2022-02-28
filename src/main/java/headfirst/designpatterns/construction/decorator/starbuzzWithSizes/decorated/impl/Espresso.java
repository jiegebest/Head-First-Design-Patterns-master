package headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.impl;

import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}
