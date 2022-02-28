package designpatterns.creator5.factory.simplefactory;

import designpatterns.creator5.factory.simplefactory.factory.PizzaStore;
import designpatterns.creator5.factory.simplefactory.factory.SimplePizzaFactory;
import designpatterns.creator5.factory.simplefactory.product.Pizza;

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
