package designpatterns.constructor7.decorator.starbuzzWithSizes.decorator;

import designpatterns.constructor7.decorator.starbuzzWithSizes.decorated.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
