package headfirst.designpatterns.creation.factory.abstractfactory.product.impl;

import headfirst.designpatterns.creation.factory.abstractfactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.creation.factory.abstractfactory.product.Pizza;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory factory;
 
	public PepperoniPizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		veggies = factory.createVeggies();
		pepperoni = factory.createPepperoni();
	}
}
