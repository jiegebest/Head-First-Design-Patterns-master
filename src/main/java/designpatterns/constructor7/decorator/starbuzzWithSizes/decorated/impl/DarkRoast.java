package designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.impl;

import designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

