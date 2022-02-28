package headfirst.designpatterns.creation.factory.abstractfactory.product.impl;

import headfirst.designpatterns.creation.factory.abstractfactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.creation.factory.abstractfactory.product.Pizza;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory factory;
 
	public VeggiePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		veggies = factory.createVeggies();
	}
}
