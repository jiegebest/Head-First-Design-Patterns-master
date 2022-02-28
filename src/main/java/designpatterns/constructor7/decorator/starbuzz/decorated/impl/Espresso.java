package designpatterns.constructor7.decorator.starbuzz.decorated.impl;

import designpatterns.constructor7.decorator.starbuzz.decorated.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

