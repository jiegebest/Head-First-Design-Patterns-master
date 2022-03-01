package designpatterns.behavior11.command.remote.command.impl;

import designpatterns.behavior11.command.remote.executors.Light;
import designpatterns.behavior11.command.remote.command.Command;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
