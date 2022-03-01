package designpatterns.behavior11.command.remote.command.impl;

import designpatterns.behavior11.command.remote.executors.Stereo;
import designpatterns.behavior11.command.remote.command.Command;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
}
