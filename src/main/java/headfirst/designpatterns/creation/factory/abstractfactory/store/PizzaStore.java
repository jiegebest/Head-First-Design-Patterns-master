package headfirst.designpatterns.creation.factory.abstractfactory.store;

import headfirst.designpatterns.creation.factory.abstractfactory.product.Pizza;
import headfirst.designpatterns.creation.factory.enums.ProductType;

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
