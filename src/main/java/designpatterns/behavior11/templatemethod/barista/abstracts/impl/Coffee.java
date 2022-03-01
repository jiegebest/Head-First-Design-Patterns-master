package designpatterns.behavior11.templatemethod.barista.abstracts.impl;

import designpatterns.behavior11.templatemethod.barista.abstracts.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
