package designpatterns.creator5.factory.abstractfactory.factory.impl;

import designpatterns.creator5.factory.abstractfactory.factory.PizzaIngredientFactory;
import designpatterns.creator5.factory.abstractfactory.product.components.cheese.Cheese;
import designpatterns.creator5.factory.abstractfactory.product.components.cheese.impl.ReggianoCheese;
import designpatterns.creator5.factory.abstractfactory.product.components.clams.Clams;
import designpatterns.creator5.factory.abstractfactory.product.components.clams.impl.FreshClams;
import designpatterns.creator5.factory.abstractfactory.product.components.dough.Dough;
import designpatterns.creator5.factory.abstractfactory.product.components.dough.impl.ThinCrustDough;
import designpatterns.creator5.factory.abstractfactory.product.components.pepperoni.Pepperoni;
import designpatterns.creator5.factory.abstractfactory.product.components.pepperoni.impl.SlicedPepperoni;
import designpatterns.creator5.factory.abstractfactory.product.components.sauce.Sauce;
import designpatterns.creator5.factory.abstractfactory.product.components.sauce.impl.MarinaraSauce;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.Veggies;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.impl.Garlic;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.impl.Mushroom;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.impl.Onion;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.impl.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
