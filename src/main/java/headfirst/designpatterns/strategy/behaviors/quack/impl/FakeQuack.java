package headfirst.designpatterns.strategy.behaviors.quack.impl;

import headfirst.designpatterns.strategy.behaviors.quack.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
