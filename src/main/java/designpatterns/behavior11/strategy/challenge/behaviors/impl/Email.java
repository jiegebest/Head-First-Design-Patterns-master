package designpatterns.behavior11.strategy.challenge.behaviors.impl;

import designpatterns.behavior11.strategy.challenge.behaviors.ShareStrategy;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
