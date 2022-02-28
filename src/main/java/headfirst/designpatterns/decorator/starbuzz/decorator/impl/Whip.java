package headfirst.designpatterns.decorator.starbuzz.decorator.impl;

import headfirst.designpatterns.decorator.starbuzz.decorated.Beverage;
import headfirst.designpatterns.decorator.starbuzz.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
