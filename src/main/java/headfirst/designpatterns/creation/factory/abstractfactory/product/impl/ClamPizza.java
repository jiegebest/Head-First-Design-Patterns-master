package headfirst.designpatterns.creation.factory.abstractfactory.product.impl;

import headfirst.designpatterns.creation.factory.abstractfactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.creation.factory.abstractfactory.product.Pizza;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory factory;
 
	public ClamPizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		clam = factory.createClam();
	}
}
