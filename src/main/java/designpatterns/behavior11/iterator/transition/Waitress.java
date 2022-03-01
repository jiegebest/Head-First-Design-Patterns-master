package designpatterns.behavior11.iterator.transition;
import designpatterns.behavior11.iterator.transition.entity.MenuItem;
import designpatterns.behavior11.iterator.transition.service.Menu;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;
  
@NoArgsConstructor
@AllArgsConstructor
public class Waitress {
	ArrayList<Menu> menus;

	public void printMenu() {
		Iterator<?> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
   
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}  
