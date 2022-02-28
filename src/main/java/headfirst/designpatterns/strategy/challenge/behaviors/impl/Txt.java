package headfirst.designpatterns.strategy.challenge.behaviors.impl;

import headfirst.designpatterns.strategy.challenge.behaviors.ShareStrategy;

public class Txt implements ShareStrategy {
	public void share() {
		System.out.println("I'm txting the photo");
	}
}
