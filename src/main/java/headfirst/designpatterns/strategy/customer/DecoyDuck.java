package headfirst.designpatterns.strategy.customer;

import headfirst.designpatterns.strategy.behaviors.fly.impl.FlyNoWay;
import headfirst.designpatterns.strategy.behaviors.quack.impl.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
