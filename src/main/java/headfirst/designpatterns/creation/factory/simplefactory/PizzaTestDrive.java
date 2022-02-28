package headfirst.designpatterns.creation.factory.simplefactory;

import headfirst.designpatterns.creation.factory.simplefactory.factory.PizzaStore;
import headfirst.designpatterns.creation.factory.simplefactory.factory.SimplePizzaFactory;
import headfirst.designpatterns.creation.factory.simplefactory.product.Pizza;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
