package headfirst.designpatterns.creation.factory.abstractfactory.factory.impl;

import headfirst.designpatterns.creation.factory.abstractfactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.cheese.Cheese;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.cheese.impl.ReggianoCheese;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.clams.Clams;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.clams.impl.FreshClams;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.dough.Dough;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.dough.impl.ThinCrustDough;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.pepperoni.Pepperoni;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.pepperoni.impl.SlicedPepperoni;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.sauce.Sauce;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.sauce.impl.MarinaraSauce;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.Veggies;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.impl.Garlic;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.impl.Mushroom;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.impl.Onion;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.impl.RedPepper;

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
