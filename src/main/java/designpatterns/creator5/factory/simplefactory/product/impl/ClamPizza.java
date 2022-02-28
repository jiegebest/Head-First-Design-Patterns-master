package designpatterns.creator5.factory.simplefactory.product.impl;

import designpatterns.creator5.factory.simplefactory.product.Pizza;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		toppings.add("Clams");
		toppings.add("Grated parmesan cheese");
	}
}
