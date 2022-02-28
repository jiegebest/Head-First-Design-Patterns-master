package headfirst.designpatterns.construction.decorator.starbuzz.decorator;

import headfirst.designpatterns.construction.decorator.starbuzz.decorated.Beverage;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	public abstract String getDescription();
}
