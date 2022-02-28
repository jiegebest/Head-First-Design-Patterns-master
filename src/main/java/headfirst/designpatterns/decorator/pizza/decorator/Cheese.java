package headfirst.designpatterns.decorator.pizza.decorator;

import headfirst.designpatterns.decorator.pizza.decorated.Pizza;
import headfirst.designpatterns.decorator.pizza.decorator.ToppingDecorator;

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
