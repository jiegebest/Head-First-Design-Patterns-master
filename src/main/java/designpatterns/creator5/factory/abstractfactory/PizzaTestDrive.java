package designpatterns.factory.pizzaaf;

import designpatterns.creator5.factory.abstractfactory.store.impl.ChicagoPizzaStore;
import designpatterns.creator5.factory.abstractfactory.store.impl.NYPizzaStore;
import designpatterns.creator5.factory.abstractfactory.store.PizzaStore;
import designpatterns.creator5.factory.abstractfactory.product.Pizza;
import designpatterns.creator5.factory.enums.ProductType;

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
