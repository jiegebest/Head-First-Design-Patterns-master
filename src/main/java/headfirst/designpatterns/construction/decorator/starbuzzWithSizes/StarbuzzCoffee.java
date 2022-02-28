package headfirst.designpatterns.construction.decorator.starbuzzWithSizes;

import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.Beverage;
import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.Beverage.Size;
import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.impl.DarkRoast;
import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.impl.Espresso;
import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorated.impl.HouseBlend;
import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorator.impl.Mocha;
import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorator.impl.Soy;
import headfirst.designpatterns.construction.decorator.starbuzzWithSizes.decorator.impl.Whip;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + String.format("%.2f", beverage.cost()));
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + String.format("%.2f", beverage2.cost()));
 
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + String.format("%.2f", beverage3.cost()));
	}
}