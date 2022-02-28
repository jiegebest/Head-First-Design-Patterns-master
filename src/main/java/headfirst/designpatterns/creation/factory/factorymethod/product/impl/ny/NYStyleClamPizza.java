package headfirst.designpatterns.creation.factory.factorymethod.product.impl.ny;
import headfirst.designpatterns.creation.factory.factorymethod.product.Pizza;
public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
