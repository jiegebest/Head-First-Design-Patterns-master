package designpatterns.behavior11.command.simpleremote.command.impl;

import designpatterns.behavior11.command.simpleremote.command.Command;
import designpatterns.behavior11.command.simpleremote.executors.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
