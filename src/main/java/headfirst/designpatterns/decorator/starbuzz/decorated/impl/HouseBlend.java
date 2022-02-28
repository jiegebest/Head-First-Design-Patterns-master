package headfirst.designpatterns.decorator.starbuzz.decorated.impl;

import headfirst.designpatterns.decorator.starbuzz.decorated.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

