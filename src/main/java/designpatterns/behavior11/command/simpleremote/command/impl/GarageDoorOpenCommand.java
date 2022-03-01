package designpatterns.behavior11.command.simpleremote.command.impl;

import designpatterns.behavior11.command.simpleremote.executors.GarageDoor;
import designpatterns.behavior11.command.simpleremote.command.Command;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
