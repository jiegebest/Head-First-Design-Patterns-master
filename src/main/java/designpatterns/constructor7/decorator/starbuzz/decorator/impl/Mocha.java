package designpatterns.constructor7.decorator.starbuzz.decorator.impl;

import designpatterns.constructor7.decorator.starbuzz.decorated.Beverage;
import designpatterns.constructor7.decorator.starbuzz.decorator.CondimentDecorator;

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
