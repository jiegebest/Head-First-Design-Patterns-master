package designpatterns.behavior11.command.remote.command.impl;

import designpatterns.behavior11.command.remote.executors.Stereo;
import designpatterns.behavior11.command.remote.command.Command;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}
