package designpatterns.behavior11.strategy.behaviors.quack.impl;

import designpatterns.behavior11.strategy.behaviors.quack.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
