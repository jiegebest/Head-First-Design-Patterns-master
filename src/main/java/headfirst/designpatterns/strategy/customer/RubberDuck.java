package headfirst.designpatterns.strategy.customer;

import headfirst.designpatterns.strategy.behaviors.fly.FlyBehavior;
import headfirst.designpatterns.strategy.behaviors.fly.impl.FlyNoWay;
import headfirst.designpatterns.strategy.behaviors.quack.QuackBehavior;
import headfirst.designpatterns.strategy.behaviors.quack.impl.Squeak;

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
