package designpatterns.constructor7.decorator.pizza.decorator;

import designpatterns.constructor7.decorator.pizza.decorated.Pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
