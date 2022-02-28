package designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.impl;

import designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

