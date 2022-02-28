package designpatterns.constructor7.decorator.starbuzzWithSizes.decorator.impl;

import designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.Beverage;
import designpatterns.constructor7.decorator.starbuzzWithSizes.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return beverage.cost() + .20;
	}
}
