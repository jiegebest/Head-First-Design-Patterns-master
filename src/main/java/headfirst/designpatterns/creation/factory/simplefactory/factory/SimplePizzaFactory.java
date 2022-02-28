package headfirst.designpatterns.creation.factory.simplefactory.factory;

import headfirst.designpatterns.creation.factory.simplefactory.product.impl.VeggiePizza;
import headfirst.designpatterns.creation.factory.simplefactory.product.Pizza;
import headfirst.designpatterns.creation.factory.simplefactory.product.impl.CheesePizza;
import headfirst.designpatterns.creation.factory.simplefactory.product.impl.ClamPizza;
import headfirst.designpatterns.creation.factory.simplefactory.product.impl.PepperoniPizza;

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
