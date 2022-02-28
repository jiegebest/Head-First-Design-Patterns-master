package headfirst.designpatterns.strategy.test;

import headfirst.designpatterns.strategy.behaviors.fly.impl.FlyRocketPowered;
import headfirst.designpatterns.strategy.customer.Duck;
import headfirst.designpatterns.strategy.customer.MallardDuck;
import headfirst.designpatterns.strategy.customer.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		// 修改行为
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
