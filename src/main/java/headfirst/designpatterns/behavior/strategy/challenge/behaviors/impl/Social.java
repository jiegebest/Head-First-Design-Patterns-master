package headfirst.designpatterns.behavior.strategy.challenge.behaviors.impl;

import headfirst.designpatterns.behavior.strategy.challenge.behaviors.ShareStrategy;

public class Social implements ShareStrategy {
	public void share() {
		System.out.println("I'm posting the photo on social media");
	}
}
