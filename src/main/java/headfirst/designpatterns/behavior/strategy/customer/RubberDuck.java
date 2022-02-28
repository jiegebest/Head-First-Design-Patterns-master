package headfirst.designpatterns.behavior.strategy.customer;

import headfirst.designpatterns.behavior.strategy.behaviors.fly.FlyBehavior;
import headfirst.designpatterns.behavior.strategy.behaviors.fly.impl.FlyNoWay;
import headfirst.designpatterns.behavior.strategy.behaviors.quack.QuackBehavior;
import headfirst.designpatterns.behavior.strategy.behaviors.quack.impl.Squeak;

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
