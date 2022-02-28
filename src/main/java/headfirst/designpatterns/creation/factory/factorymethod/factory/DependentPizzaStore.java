package headfirst.designpatterns.creation.factory.factorymethod.factory;

import headfirst.designpatterns.creation.factory.factorymethod.product.Pizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.chicago.ChicagoStyleCheesePizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.chicago.ChicagoStyleClamPizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.chicago.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.chicago.ChicagoStyleVeggiePizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny.NYStyleCheesePizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny.NYStyleClamPizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny.NYStylePepperoniPizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny.NYStyleVeggiePizza;

public class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
