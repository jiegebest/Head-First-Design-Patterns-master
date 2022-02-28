package headfirst.designpatterns.decorator.starbuzz.decorated.impl;

import headfirst.designpatterns.decorator.starbuzz.decorated.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

