package headfirst.designpatterns.creation.factory.factorymethod.factory.impl;

import headfirst.designpatterns.creation.factory.factorymethod.factory.PizzaStore;
import headfirst.designpatterns.creation.factory.factorymethod.product.Pizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.chicago.ChicagoStyleCheesePizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.chicago.ChicagoStyleClamPizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.chicago.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.creation.factory.factorymethod.product.impl.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
