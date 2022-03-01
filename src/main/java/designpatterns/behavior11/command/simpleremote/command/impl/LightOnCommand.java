package designpatterns.behavior11.command.simpleremote.command.impl;

import designpatterns.behavior11.command.simpleremote.command.Command;
import designpatterns.behavior11.command.simpleremote.executors.Light;

public class LightOnCommand implements Command {
	Light light;
  
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}
}
