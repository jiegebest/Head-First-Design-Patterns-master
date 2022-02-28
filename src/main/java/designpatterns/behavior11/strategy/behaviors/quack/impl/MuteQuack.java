package designpatterns.behavior11.strategy.behaviors.quack.impl;

import designpatterns.behavior11.strategy.behaviors.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	// 不会叫
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
