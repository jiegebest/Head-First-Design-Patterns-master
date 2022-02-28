package designpatterns.behavior11.strategy.behaviors.fly.impl;

import designpatterns.behavior11.strategy.behaviors.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
