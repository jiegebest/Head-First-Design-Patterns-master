package designpatterns.creator5.factory.factorymethod.factory.impl;

import designpatterns.creator5.factory.factorymethod.factory.PizzaStore;
import designpatterns.creator5.factory.factorymethod.product.Pizza;
import designpatterns.creator5.factory.factorymethod.product.impl.chicago.ChicagoStyleCheesePizza;
import designpatterns.creator5.factory.factorymethod.product.impl.chicago.ChicagoStyleClamPizza;
import designpatterns.creator5.factory.factorymethod.product.impl.chicago.ChicagoStylePepperoniPizza;
import designpatterns.creator5.factory.factorymethod.product.impl.chicago.ChicagoStyleVeggiePizza;

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
