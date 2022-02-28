package designpatterns.behavior11.strategy.challenge.behaviors.impl;

import designpatterns.behavior11.strategy.challenge.behaviors.ShareStrategy;

public class Social implements ShareStrategy {
	public void share() {
		System.out.println("I'm posting the photo on social media");
	}
}
