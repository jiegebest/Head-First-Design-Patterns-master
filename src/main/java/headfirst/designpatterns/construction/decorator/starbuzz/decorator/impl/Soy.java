package headfirst.designpatterns.construction.decorator.starbuzz.decorator.impl;

import headfirst.designpatterns.construction.decorator.starbuzz.decorated.Beverage;
import headfirst.designpatterns.construction.decorator.starbuzz.decorator.CondimentDecorator;

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
