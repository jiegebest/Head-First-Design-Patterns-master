package designpatterns.behavior11.command.remote.command.impl;

import designpatterns.behavior11.command.remote.executors.GarageDoor;
import designpatterns.behavior11.command.remote.command.Command;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
