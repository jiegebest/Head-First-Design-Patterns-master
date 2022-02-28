package designpatterns.behavior11.strategy.challenge;

import designpatterns.behavior11.strategy.challenge.behaviors.impl.Email;
import designpatterns.behavior11.strategy.challenge.behaviors.impl.Social;
import designpatterns.behavior11.strategy.challenge.behaviors.impl.Txt;
import designpatterns.behavior11.strategy.challenge.customer.BasicCameraApp;
import designpatterns.behavior11.strategy.challenge.customer.PhoneCameraApp;

import java.util.Scanner;

public class PhotoWithPhone {

	public static void main(String[] args) {
		PhoneCameraApp cameraApp = new BasicCameraApp();
		String share = getSharing();
		switch (share) {
			case ("t"):
				cameraApp.setShareStrategy(new Txt());
				break;
			case ("e"):
				cameraApp.setShareStrategy(new Email());
				break;
			case ("s"):
				cameraApp.setShareStrategy(new Social());
				break;
			default:
				cameraApp.setShareStrategy(new Txt());
		}
		cameraApp.take();
		cameraApp.edit();
		cameraApp.save();
		cameraApp.share();
	}

	public static String getSharing() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Share with txt (t), email (e), or social media (s)?");
		String appName = scanner.next();
		scanner.close();
		return appName;
	}
}
