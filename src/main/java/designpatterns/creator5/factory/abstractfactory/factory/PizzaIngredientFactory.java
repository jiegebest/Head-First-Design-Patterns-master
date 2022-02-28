package designpatterns.creator5.factory.abstractfactory.factory;

import designpatterns.creator5.factory.abstractfactory.product.components.cheese.Cheese;
import designpatterns.creator5.factory.abstractfactory.product.components.clams.Clams;
import designpatterns.creator5.factory.abstractfactory.product.components.dough.Dough;
import designpatterns.creator5.factory.abstractfactory.product.components.pepperoni.Pepperoni;
import designpatterns.creator5.factory.abstractfactory.product.components.sauce.Sauce;
import designpatterns.creator5.factory.abstractfactory.product.components.veggies.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
