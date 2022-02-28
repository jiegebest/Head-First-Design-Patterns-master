package headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorator;

import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
