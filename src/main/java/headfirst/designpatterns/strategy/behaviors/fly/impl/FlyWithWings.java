package headfirst.designpatterns.strategy.behaviors.fly.impl;

import headfirst.designpatterns.strategy.behaviors.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	// 会飞
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
