package headfirst.designpatterns.decorator.starbuzz.decorated.impl;

import headfirst.designpatterns.decorator.starbuzz.decorated.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

