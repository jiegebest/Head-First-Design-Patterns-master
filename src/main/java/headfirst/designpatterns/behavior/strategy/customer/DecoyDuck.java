package headfirst.designpatterns.behavior.strategy.customer;

import headfirst.designpatterns.behavior.strategy.behaviors.fly.impl.FlyNoWay;
import headfirst.designpatterns.behavior.strategy.behaviors.quack.impl.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
