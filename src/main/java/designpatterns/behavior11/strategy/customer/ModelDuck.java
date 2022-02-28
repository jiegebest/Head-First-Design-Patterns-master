package designpatterns.behavior11.strategy.customer;

import designpatterns.behavior11.strategy.behaviors.fly.impl.FlyNoWay;
import designpatterns.behavior11.strategy.behaviors.quack.impl.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
