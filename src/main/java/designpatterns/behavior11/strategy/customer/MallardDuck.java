package designpatterns.behavior11.strategy.customer;

import designpatterns.behavior11.strategy.behaviors.fly.impl.FlyWithWings;
import designpatterns.behavior11.strategy.behaviors.quack.impl.Quack;

// 绿头鸭
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
