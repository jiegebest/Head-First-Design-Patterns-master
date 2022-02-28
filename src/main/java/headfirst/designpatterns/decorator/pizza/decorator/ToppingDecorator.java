package headfirst.designpatterns.decorator.pizza.decorator;

import headfirst.designpatterns.decorator.pizza.decorated.Pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
