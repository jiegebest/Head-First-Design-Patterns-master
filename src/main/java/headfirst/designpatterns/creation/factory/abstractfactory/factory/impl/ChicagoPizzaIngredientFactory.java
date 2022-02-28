package headfirst.designpatterns.creation.factory.abstractfactory.factory.impl;

import headfirst.designpatterns.creation.factory.abstractfactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.cheese.Cheese;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.cheese.impl.MozzarellaCheese;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.clams.Clams;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.clams.impl.FrozenClams;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.dough.Dough;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.dough.impl.ThickCrustDough;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.pepperoni.Pepperoni;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.pepperoni.impl.SlicedPepperoni;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.sauce.Sauce;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.sauce.impl.PlumTomatoSauce;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.Veggies;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.impl.BlackOlives;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.impl.Eggplant;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.impl.Spinach;

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
