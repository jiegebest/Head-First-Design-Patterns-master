package designpatterns.constructor7.decorator.starbuzz.decorator.impl;

import designpatterns.constructor7.decorator.starbuzz.decorated.Beverage;
import designpatterns.constructor7.decorator.starbuzz.decorator.CondimentDecorator;

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
