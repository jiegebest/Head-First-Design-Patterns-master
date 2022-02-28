package headfirst.designpatterns.strategy.customer;

import headfirst.designpatterns.strategy.behaviors.fly.impl.FlyWithWings;
import headfirst.designpatterns.strategy.behaviors.quack.impl.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
