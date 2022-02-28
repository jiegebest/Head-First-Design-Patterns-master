package headfirst.designpatterns.strategy.challenge.behaviors.impl;

import headfirst.designpatterns.strategy.challenge.behaviors.ShareStrategy;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
