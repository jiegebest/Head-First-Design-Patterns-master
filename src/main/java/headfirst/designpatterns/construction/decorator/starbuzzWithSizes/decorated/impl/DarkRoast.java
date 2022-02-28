package headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.impl;

import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

