package headfirst.designpatterns.construction.decorator.pizza.decorator;

import headfirst.designpatterns.construction.decorator.pizza.decorated.Pizza;

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
