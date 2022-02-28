package designpatterns.behavior11.strategy.customer;

import designpatterns.behavior11.strategy.behaviors.fly.FlyBehavior;
import designpatterns.behavior11.strategy.behaviors.fly.impl.FlyNoWay;
import designpatterns.behavior11.strategy.behaviors.quack.QuackBehavior;
import designpatterns.behavior11.strategy.behaviors.quack.impl.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
