package headfirst.designpatterns.behavior.strategy.test;

import headfirst.designpatterns.behavior.strategy.customer.DecoyDuck;
import headfirst.designpatterns.behavior.strategy.behaviors.fly.impl.FlyRocketPowered;
import headfirst.designpatterns.behavior.strategy.customer.Duck;
import headfirst.designpatterns.behavior.strategy.customer.MallardDuck;
import headfirst.designpatterns.behavior.strategy.customer.ModelDuck;
import headfirst.designpatterns.behavior.strategy.customer.RubberDuck;
import headfirst.designpatterns.behavior.strategy.behaviors.fly.FlyBehavior;
import headfirst.designpatterns.behavior.strategy.behaviors.quack.QuackBehavior;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");

		MallardDuck mallard = new MallardDuck();

		RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
