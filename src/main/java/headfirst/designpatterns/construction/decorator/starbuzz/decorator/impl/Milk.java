package headfirst.designpatterns.construction.decorator.starbuzz.decorator.impl;

import headfirst.designpatterns.construction.decorator.starbuzz.decorated.Beverage;
import headfirst.designpatterns.construction.decorator.starbuzz.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
