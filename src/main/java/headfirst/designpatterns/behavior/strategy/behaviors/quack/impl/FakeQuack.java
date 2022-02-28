package headfirst.designpatterns.behavior.strategy.behaviors.quack.impl;

import headfirst.designpatterns.behavior.strategy.behaviors.quack.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
