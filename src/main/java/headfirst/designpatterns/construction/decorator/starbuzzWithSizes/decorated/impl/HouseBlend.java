package headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.impl;

import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}
