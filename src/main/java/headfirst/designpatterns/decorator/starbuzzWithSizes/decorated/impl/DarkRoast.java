package headfirst.designpatterns.decorator.starbuzzWithSizes.decorated.impl;

import headfirst.designpatterns.decorator.starbuzzWithSizes.decorated.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

