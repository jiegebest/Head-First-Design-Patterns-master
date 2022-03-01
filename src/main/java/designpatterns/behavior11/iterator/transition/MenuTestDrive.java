package designpatterns.behavior11.iterator.transition;
import designpatterns.behavior11.iterator.transition.service.Menu;
import designpatterns.behavior11.iterator.transition.service.impl.DinerMenu;
import designpatterns.behavior11.iterator.transition.service.impl.PancakeHouseMenu;

import java.util.ArrayList;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		ArrayList<Menu> menus = new ArrayList<>();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);

		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}
