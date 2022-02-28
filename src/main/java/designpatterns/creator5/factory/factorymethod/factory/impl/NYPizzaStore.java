package designpatterns.creator5.factory.factorymethod.factory.impl;

import designpatterns.creator5.factory.factorymethod.factory.PizzaStore;
import designpatterns.creator5.factory.factorymethod.product.Pizza;
import designpatterns.creator5.factory.factorymethod.product.impl.ny.NYStyleCheesePizza;
import designpatterns.creator5.factory.factorymethod.product.impl.ny.NYStyleClamPizza;
import designpatterns.creator5.factory.factorymethod.product.impl.ny.NYStylePepperoniPizza;
import designpatterns.creator5.factory.factorymethod.product.impl.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
