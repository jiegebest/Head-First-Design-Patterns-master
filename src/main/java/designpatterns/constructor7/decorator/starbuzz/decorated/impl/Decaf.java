package designpatterns.constructor7.decorator.starbuzz.decorated.impl;

import designpatterns.constructor7.decorator.starbuzz.decorated.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

