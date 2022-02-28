package headfirst.designpatterns.construction.decorator.pizza.decorator;

import headfirst.designpatterns.construction.decorator.pizza.decorated.Pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
