package designpatterns.constructor7.decorator.starbuzz.decorator;

import designpatterns.constructor7.decorator.starbuzz.decorated.Beverage;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	public abstract String getDescription();
}
