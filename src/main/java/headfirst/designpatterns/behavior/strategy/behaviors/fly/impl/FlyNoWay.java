package headfirst.designpatterns.behavior.strategy.behaviors.fly.impl;

import headfirst.designpatterns.behavior.strategy.behaviors.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	// 不会飞
	public void fly() {
		System.out.println("I can't fly");
	}
}
