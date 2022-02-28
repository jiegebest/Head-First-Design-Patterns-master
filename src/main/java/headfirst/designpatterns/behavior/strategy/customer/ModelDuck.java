package headfirst.designpatterns.behavior.strategy.customer;

import headfirst.designpatterns.behavior.strategy.behaviors.fly.impl.FlyNoWay;
import headfirst.designpatterns.behavior.strategy.behaviors.quack.impl.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
