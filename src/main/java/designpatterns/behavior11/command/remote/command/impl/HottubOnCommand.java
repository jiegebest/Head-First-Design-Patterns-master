package designpatterns.behavior11.command.remote.command.impl;

import designpatterns.behavior11.command.remote.executors.Hottub;
import designpatterns.behavior11.command.remote.command.Command;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
