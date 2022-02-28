package headfirst.designpatterns.construction.decorator.starbuzz.decorator.impl;

import headfirst.designpatterns.construction.decorator.starbuzz.decorated.Beverage;
import headfirst.designpatterns.construction.decorator.starbuzz.decorator.CondimentDecorator;

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
