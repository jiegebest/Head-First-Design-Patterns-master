package designpatterns.creator5.factory.abstractfactory.store.impl;

import designpatterns.creator5.factory.abstractfactory.factory.PizzaIngredientFactory;
import designpatterns.creator5.factory.abstractfactory.factory.impl.ChicagoPizzaIngredientFactory;
import designpatterns.creator5.factory.abstractfactory.product.Pizza;
import designpatterns.creator5.factory.abstractfactory.product.impl.CheesePizza;
import designpatterns.creator5.factory.abstractfactory.product.impl.ClamPizza;
import designpatterns.creator5.factory.abstractfactory.product.impl.PepperoniPizza;
import designpatterns.creator5.factory.abstractfactory.product.impl.VeggiePizza;
import designpatterns.creator5.factory.abstractfactory.store.PizzaStore;
import designpatterns.creator5.factory.enums.ProductType;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(ProductType productType) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
		switch (productType) {
			case CLAM:
				pizza = new ClamPizza(factory);
				pizza.setName("Chicago Style Clam Pizza");
				break;
			case CHEESE:
				pizza = new CheesePizza(factory);
				pizza.setName("Chicago Style Cheese Pizza");
				break;
			case VEGGIE:
				pizza = new VeggiePizza(factory);
				pizza.setName("Chicago Style Veggie Pizza");
				break;
			case PEPPERONI:
				pizza = new PepperoniPizza(factory);
				pizza.setName("Chicago Style Pepperoni Pizza");
				break;
		}
		return pizza;
	}
}
