package designpatterns.behavior11.strategy.customer;

import designpatterns.behavior11.strategy.behaviors.fly.impl.FlyNoWay;
import designpatterns.behavior11.strategy.behaviors.quack.impl.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
