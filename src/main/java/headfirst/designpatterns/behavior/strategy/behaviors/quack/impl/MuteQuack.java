package headfirst.designpatterns.behavior.strategy.behaviors.quack.impl;

import headfirst.designpatterns.behavior.strategy.behaviors.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	// 不会叫
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
