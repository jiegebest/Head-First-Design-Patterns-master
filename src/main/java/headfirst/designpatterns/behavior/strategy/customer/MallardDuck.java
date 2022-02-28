package headfirst.designpatterns.behavior.strategy.customer;

import headfirst.designpatterns.behavior.strategy.behaviors.fly.impl.FlyWithWings;
import headfirst.designpatterns.behavior.strategy.behaviors.quack.impl.Quack;

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
