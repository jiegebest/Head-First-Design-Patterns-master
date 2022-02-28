package headfirst.designpatterns.behavior.strategy.behaviors.quack.impl;

import headfirst.designpatterns.behavior.strategy.behaviors.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
	// 吱吱叫
	public void quack() {
		System.out.println("Squeak");
	}
}
