package designpatterns.behavior11.command.remote.command.impl;

import designpatterns.behavior11.command.remote.executors.CeilingFan;
import designpatterns.behavior11.command.remote.command.Command;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
