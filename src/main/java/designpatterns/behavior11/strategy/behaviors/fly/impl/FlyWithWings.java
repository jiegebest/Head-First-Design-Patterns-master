package designpatterns.behavior11.strategy.behaviors.fly.impl;

import designpatterns.behavior11.strategy.behaviors.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	// 会飞
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
