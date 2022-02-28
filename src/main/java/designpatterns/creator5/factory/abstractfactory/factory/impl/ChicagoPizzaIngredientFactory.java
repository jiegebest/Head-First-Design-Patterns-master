package designpatterns.creator5.factory.abstractfactory.factory.impl;

import designpatterns.creator5.factory.abstractfactory.factory.PizzaIngredientFactory;
import designpatterns.creator5.factory.abstractfactory.product.components.cheese.Cheese;
import designpatterns.creator5.factory.abstractfactory.product.components.cheese.impl.MozzarellaCheese;
import designpatterns.creator5.factory.abstractfactory.product.components.clams.Clams;
import designpatterns.creator5.factory.abstractfactory.product.components.clams.impl.FrozenClams;
import designpatterns.creator5.factory.abstractfactory.product.components.dough.Dough;
import designpatterns.creator5.factory.abstractfactory.product.components.dough.impl.ThickCrustDough;
import designpatterns.creator5.factory.abstractfactory.product.components.pepperoni.Pepperoni;
import designpatterns.creator5.factory.abstractfactory.product.components.pepperoni.impl.SlicedPepperoni;
import designpatterns.creator5.factory.abstractfactory.product.components.sauce.Sauce;
import designpatterns.creator5.factory.abstractfactory.product.components.sauce.impl.PlumTomatoSauce;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.Veggies;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.impl.BlackOlives;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.impl.Eggplant;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.impl.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
