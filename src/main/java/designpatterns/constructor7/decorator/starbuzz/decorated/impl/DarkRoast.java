package designpatterns.constructor7.decorator.starbuzz.decorated.impl;

import designpatterns.constructor7.decorator.starbuzz.decorated.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

