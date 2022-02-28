package designpatterns.behavior11.strategy.behaviors.quack.impl;

import designpatterns.behavior11.strategy.behaviors.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
	// 吱吱叫
	public void quack() {
		System.out.println("Squeak");
	}
}
