package headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny;
import headfirst.designpatterns.creation.factory.factorymethod.product.Pizza;
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}
