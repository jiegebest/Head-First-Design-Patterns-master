package headfirst.designpatterns.creation.factory.abstractfactory.factory;

import headfirst.designpatterns.creation.factory.abstractfactory.product.components.cheese.Cheese;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.clams.Clams;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.dough.Dough;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.pepperoni.Pepperoni;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.sauce.Sauce;
import headfirst.designpatterns.creation.factory.abstractfactory.product.components.veggies.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
