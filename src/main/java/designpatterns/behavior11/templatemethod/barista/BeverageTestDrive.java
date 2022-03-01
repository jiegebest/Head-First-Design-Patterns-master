package designpatterns.behavior11.templatemethod.barista;

import designpatterns.behavior11.templatemethod.barista.abstracts.impl.Coffee;
import designpatterns.behavior11.templatemethod.barista.abstracts.impl.CoffeeWithHook;
import designpatterns.behavior11.templatemethod.barista.abstracts.impl.Tea;
import designpatterns.behavior11.templatemethod.barista.abstracts.impl.TeaWithHook;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
