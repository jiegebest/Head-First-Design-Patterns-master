package designpatterns.constructor7.decorator.starbuzzWithSizes.decorator.impl;

import designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.Beverage;
import designpatterns.constructor7.decorator.starbuzzWithSizes.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
