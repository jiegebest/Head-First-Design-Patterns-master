package designpatterns.behavior11.command.simpleremote.executors;

public class Light {

	public Light() {
	}

	public void on() {
		System.out.println("Light is on");
	}

	public void off() {
		System.out.println("Light is off");
	}
}