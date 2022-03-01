package designpatterns.constructor7.composite.menu;

import designpatterns.constructor7.composite.menu.service.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
