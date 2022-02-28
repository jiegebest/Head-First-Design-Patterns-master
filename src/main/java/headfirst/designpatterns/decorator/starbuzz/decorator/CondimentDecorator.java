package headfirst.designpatterns.decorator.starbuzz.decorator;

import headfirst.designpatterns.decorator.starbuzz.decorated.Beverage;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	public abstract String getDescription();
}
