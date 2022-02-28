package designpatterns.behavior11.strategy.behaviors.fly.impl;

import designpatterns.behavior11.strategy.behaviors.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	// 不会飞
	public void fly() {
		System.out.println("I can't fly");
	}
}
