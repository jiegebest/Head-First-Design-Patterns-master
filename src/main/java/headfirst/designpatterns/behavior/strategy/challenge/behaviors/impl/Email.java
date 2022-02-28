package headfirst.designpatterns.behavior.strategy.challenge.behaviors.impl;

import headfirst.designpatterns.behavior.strategy.challenge.behaviors.ShareStrategy;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
