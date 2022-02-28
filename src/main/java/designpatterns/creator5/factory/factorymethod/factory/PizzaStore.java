package designpatterns.creator5.factory.factorymethod.factory;

import designpatterns.creator5.factory.factorymethod.product.Pizza;

public abstract class PizzaStore {

	// 创建产品雏形
	protected abstract Pizza createPizza(String item);

	//  将产品原型加工为成品
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
