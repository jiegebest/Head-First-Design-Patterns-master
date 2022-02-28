package headfirst.designpatterns.construction.decorator.starbuzz.decorated.impl;

import headfirst.designpatterns.construction.decorator.starbuzz.decorated.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

