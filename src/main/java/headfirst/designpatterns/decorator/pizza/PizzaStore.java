package headfirst.designpatterns.decorator.pizza;

import headfirst.designpatterns.decorator.pizza.decorator.Cheese;
import headfirst.designpatterns.decorator.pizza.decorated.Pizza;
import headfirst.designpatterns.decorator.pizza.decorated.ThincrustPizza;
import headfirst.designpatterns.decorator.pizza.decorator.Olives;

public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.println(greekPizza.getDescription() 
				+ " $" + greekPizza.cost());

	}
}
