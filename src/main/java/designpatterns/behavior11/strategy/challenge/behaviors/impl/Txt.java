package designpatterns.behavior11.strategy.challenge.behaviors.impl;

import designpatterns.behavior11.strategy.challenge.behaviors.ShareStrategy;

public class Txt implements ShareStrategy {
	public void share() {
		System.out.println("I'm txting the photo");
	}
}
