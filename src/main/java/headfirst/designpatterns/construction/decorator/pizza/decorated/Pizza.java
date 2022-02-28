package headfirst.designpatterns.construction.decorator.pizza.decorated;

public abstract class Pizza {
	String description = "Basic Pizza";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
