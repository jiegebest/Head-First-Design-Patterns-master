package designpatterns.behavior11.command.simpleremote;

import designpatterns.behavior11.command.simpleremote.command.impl.GarageDoorOpenCommand;
import designpatterns.behavior11.command.simpleremote.command.impl.LightOnCommand;
import designpatterns.behavior11.command.simpleremote.controller.SimpleRemoteControl;
import designpatterns.behavior11.command.simpleremote.executors.GarageDoor;
import designpatterns.behavior11.command.simpleremote.executors.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen =
		    new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
	
}
