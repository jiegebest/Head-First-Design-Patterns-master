package designpatterns.constructor7.decorator.pizza.decorator;

import designpatterns.constructor7.decorator.pizza.decorated.Pizza;

public class Cheese extends ToppingDecorator {

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}
 
	public double cost() {
		return pizza.cost(); // cheese is free
	}
}
