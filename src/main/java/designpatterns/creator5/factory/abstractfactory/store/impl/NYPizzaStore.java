package designpatterns.creator5.factory.abstractfactory.store.impl;

import designpatterns.creator5.factory.abstractfactory.factory.PizzaIngredientFactory;
import designpatterns.creator5.factory.abstractfactory.factory.impl.NYPizzaIngredientFactory;
import designpatterns.creator5.factory.abstractfactory.product.Pizza;
import designpatterns.creator5.factory.abstractfactory.product.impl.CheesePizza;
import designpatterns.creator5.factory.abstractfactory.product.impl.ClamPizza;
import designpatterns.creator5.factory.abstractfactory.product.impl.PepperoniPizza;
import designpatterns.creator5.factory.abstractfactory.product.impl.VeggiePizza;
import designpatterns.creator5.factory.abstractfactory.store.PizzaStore;
import designpatterns.creator5.factory.enums.ProductType;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(ProductType productType) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		switch (productType) {
			case CHEESE:
				pizza = new CheesePizza(factory);
				pizza.setName("New York Style Cheese Pizza");
				break;
			case VEGGIE:
				pizza = new VeggiePizza(factory);
				pizza.setName("New York Style Veggie Pizza");
				break;
			case CLAM:
				pizza = new ClamPizza(factory);
				pizza.setName("New York Style Veggie Pizza");
				break;
			case PEPPERONI:
				pizza = new PepperoniPizza(factory);
				pizza.setName("New York Style Pepperoni Pizza");
				break;
		}
		return pizza;
	}
}
