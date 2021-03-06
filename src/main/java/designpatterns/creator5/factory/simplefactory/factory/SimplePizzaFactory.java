package designpatterns.creator5.factory.simplefactory.factory;

import designpatterns.creator5.factory.simplefactory.product.impl.VeggiePizza;
import designpatterns.creator5.factory.simplefactory.product.Pizza;
import designpatterns.creator5.factory.simplefactory.product.impl.CheesePizza;
import designpatterns.creator5.factory.simplefactory.product.impl.ClamPizza;
import designpatterns.creator5.factory.simplefactory.product.impl.PepperoniPizza;

// 工厂创建产品的雏形
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
