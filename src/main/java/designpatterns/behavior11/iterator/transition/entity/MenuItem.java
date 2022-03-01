package designpatterns.behavior11.iterator.transition.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuItem {
	String name;
	String description;
	boolean vegetarian;
	double price;
}
