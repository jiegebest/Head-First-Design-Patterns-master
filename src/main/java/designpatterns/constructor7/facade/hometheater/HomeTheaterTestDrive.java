package designpatterns.constructor7.facade.hometheater;

import designpatterns.constructor7.facade.hometheater.entity.*;
import designpatterns.constructor7.facade.hometheater.entity.StreamingPlayer;
import designpatterns.constructor7.facade.hometheater.entity.Tuner;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Amplifier");
		Tuner tuner = new Tuner("AM/FM Tuner", amp);
		StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
		CdPlayer cd = new CdPlayer("CD Player", amp);
		Projector projector = new Projector("Projector", player);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, cd, projector, lights, screen, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
