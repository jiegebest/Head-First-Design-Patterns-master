package headfirst.designpatterns.behavior.strategy.behaviors.quack.impl;

import headfirst.designpatterns.behavior.strategy.behaviors.quack.QuackBehavior;
public class Quack implements QuackBehavior {
	//  呱呱叫
	public void quack() {
		System.out.println("Quack");
	}
}
