package designpatterns.behavior11.strategy.behaviors.quack.impl;

import designpatterns.behavior11.strategy.behaviors.quack.QuackBehavior;
public class Quack implements QuackBehavior {
	//  呱呱叫
	public void quack() {
		System.out.println("Quack");
	}
}
