package headfirst.designpatterns.decorator.starbuzz.decorator.impl;

import headfirst.designpatterns.decorator.starbuzz.decorated.Beverage;
import headfirst.designpatterns.decorator.starbuzz.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
