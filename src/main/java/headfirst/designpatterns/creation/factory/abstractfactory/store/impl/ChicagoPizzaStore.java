package headfirst.designpatterns.creation.factory.abstractfactory.store.impl;

import headfirst.designpatterns.creation.factory.abstractfactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.creation.factory.abstractfactory.factory.impl.ChicagoPizzaIngredientFactory;
import headfirst.designpatterns.creation.factory.abstractfactory.product.Pizza;
import headfirst.designpatterns.creation.factory.abstractfactory.product.impl.CheesePizza;
import headfirst.designpatterns.creation.factory.abstractfactory.product.impl.ClamPizza;
import headfirst.designpatterns.creation.factory.abstractfactory.product.impl.PepperoniPizza;
import headfirst.designpatterns.creation.factory.abstractfactory.product.impl.VeggiePizza;
import headfirst.designpatterns.creation.factory.abstractfactory.store.PizzaStore;
import headfirst.designpatterns.creation.factory.enums.ProductType;

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
