package designpatterns.constructor7.decorator.starbuzz.decorator.impl;

import designpatterns.constructor7.decorator.starbuzz.decorated.Beverage;
import designpatterns.constructor7.decorator.starbuzz.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
