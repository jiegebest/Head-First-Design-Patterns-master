package designpatterns.constructor7.decorator.pizza;

import designpatterns.constructor7.decorator.pizza.decorator.Cheese;
import designpatterns.constructor7.decorator.pizza.decorated.Pizza;
import designpatterns.constructor7.decorator.pizza.decorated.ThincrustPizza;
import designpatterns.constructor7.decorator.pizza.decorator.Olives;

public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.println(greekPizza.getDescription() 
				+ " $" + greekPizza.cost());

	}
}
