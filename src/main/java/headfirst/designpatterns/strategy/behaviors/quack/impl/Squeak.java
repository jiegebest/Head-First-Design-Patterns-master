package headfirst.designpatterns.strategy.behaviors.quack.impl;

import headfirst.designpatterns.strategy.behaviors.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
	// 吱吱叫
	public void quack() {
		System.out.println("Squeak");
	}
}
