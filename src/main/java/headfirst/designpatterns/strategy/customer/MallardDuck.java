package headfirst.designpatterns.strategy.customer;

import headfirst.designpatterns.strategy.behaviors.fly.impl.FlyWithWings;
import headfirst.designpatterns.strategy.behaviors.quack.impl.Quack;

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
