package designpatterns.constructor7.decorator.starbuzz.decorated;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
