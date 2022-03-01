package designpatterns.behavior11.command.remote.command.impl;

import designpatterns.behavior11.command.remote.executors.CeilingFan;
import designpatterns.behavior11.command.remote.command.Command;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
}
