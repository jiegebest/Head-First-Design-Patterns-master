package headfirst.designpatterns.creation.factory.simplefactory.factory;

import headfirst.designpatterns.creation.factory.simplefactory.product.Pizza;
import lombok.AllArgsConstructor;

// 加工商：产品经过二次加工成为成品
@AllArgsConstructor
public class PizzaStore {
	SimplePizzaFactory factory;

	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
