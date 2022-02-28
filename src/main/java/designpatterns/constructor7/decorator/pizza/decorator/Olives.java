package designpatterns.constructor7.decorator.pizza.decorator;

import designpatterns.constructor7.decorator.pizza.decorated.Pizza;

public class Olives extends ToppingDecorator {
	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Olives";
	}

	public double cost() {
		return pizza.cost() + .30; 
	}
}
