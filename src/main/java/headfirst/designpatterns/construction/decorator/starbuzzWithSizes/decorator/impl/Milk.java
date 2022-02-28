package headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorator.impl;

import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.Beverage;
import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorator.CondimentDecorator;

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
