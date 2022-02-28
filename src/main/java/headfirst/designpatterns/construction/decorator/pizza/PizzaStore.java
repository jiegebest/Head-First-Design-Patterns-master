package headfirst.designpatterns.construction.decorator.pizza;

import headfirst.designpatterns.construction.decorator.pizza.decorator.Cheese;
import headfirst.designpatterns.construction.decorator.pizza.decorated.Pizza;
import headfirst.designpatterns.construction.decorator.pizza.decorated.ThincrustPizza;
import headfirst.designpatterns.construction.decorator.pizza.decorator.Olives;

public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.println(greekPizza.getDescription() 
				+ " $" + greekPizza.cost());

	}
}
