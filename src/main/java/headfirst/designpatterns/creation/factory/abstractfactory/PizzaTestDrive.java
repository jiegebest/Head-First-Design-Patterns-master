package headfirst.designpatterns.factory.pizzaaf;

import headfirst.designpatterns.creation.factory.abstractfactory.store.impl.ChicagoPizzaStore;
import headfirst.designpatterns.creation.factory.abstractfactory.store.impl.NYPizzaStore;
import headfirst.designpatterns.creation.factory.abstractfactory.store.PizzaStore;
import headfirst.designpatterns.creation.factory.abstractfactory.product.Pizza;
import headfirst.designpatterns.creation.factory.enums.ProductType;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza(ProductType.CHEESE);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(ProductType.CHEESE);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(ProductType.CLAM);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(ProductType.CLAM);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(ProductType.PEPPERONI);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(ProductType.PEPPERONI);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(ProductType.VEGGIE);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(ProductType.VEGGIE);
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
