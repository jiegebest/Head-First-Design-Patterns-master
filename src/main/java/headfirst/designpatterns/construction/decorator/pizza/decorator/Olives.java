package headfirst.designpatterns.construction.decorator.pizza.decorator;

import headfirst.designpatterns.construction.decorator.pizza.decorated.Pizza;

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
