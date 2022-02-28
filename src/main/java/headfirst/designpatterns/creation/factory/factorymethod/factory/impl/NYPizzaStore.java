package headfirst.designpatterns.creation.factory.factorymethod.factory.impl;

import headfirst.designpatterns.creation.factory.factorymethod.factory.PizzaStore;
import headfirst.designpatterns.creation.factory.factorymethod.product.Pizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny.NYStyleCheesePizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny.NYStyleClamPizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny.NYStylePepperoniPizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny.NYStyleVeggiePizza;

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
