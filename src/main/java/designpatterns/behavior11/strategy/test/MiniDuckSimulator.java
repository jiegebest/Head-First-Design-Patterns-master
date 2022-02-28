package designpatterns.behavior11.strategy.test;

import designpatterns.behavior11.strategy.customer.DecoyDuck;
import designpatterns.behavior11.strategy.behaviors.fly.impl.FlyRocketPowered;
import designpatterns.behavior11.strategy.customer.Duck;
import designpatterns.behavior11.strategy.customer.MallardDuck;
import designpatterns.behavior11.strategy.customer.ModelDuck;
import designpatterns.behavior11.strategy.customer.RubberDuck;
import designpatterns.behavior11.strategy.behaviors.fly.FlyBehavior;
import designpatterns.behavior11.strategy.behaviors.quack.QuackBehavior;

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
