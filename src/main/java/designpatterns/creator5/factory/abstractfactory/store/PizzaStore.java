package designpatterns.creator5.factory.abstractfactory.store;

import designpatterns.creator5.factory.abstractfactory.product.Pizza;
import designpatterns.creator5.factory.enums.ProductType;

public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(ProductType productType);
 
	public Pizza orderPizza(ProductType productType) {
		Pizza pizza = createPizza(productType);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
