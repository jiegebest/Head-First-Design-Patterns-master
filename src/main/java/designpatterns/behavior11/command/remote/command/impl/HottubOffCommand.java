package designpatterns.behavior11.command.remote.command.impl;

import designpatterns.behavior11.command.remote.executors.Hottub;
import designpatterns.behavior11.command.remote.command.Command;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
