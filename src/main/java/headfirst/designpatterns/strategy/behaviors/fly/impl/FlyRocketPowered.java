package headfirst.designpatterns.strategy.behaviors.fly.impl;

import headfirst.designpatterns.strategy.behaviors.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
