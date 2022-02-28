package headfirst.designpatterns.decorator.pizza.decorator;

import headfirst.designpatterns.decorator.pizza.decorated.Pizza;
import headfirst.designpatterns.decorator.pizza.decorator.ToppingDecorator;

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
