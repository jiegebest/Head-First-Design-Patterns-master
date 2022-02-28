package designpatterns.behavior11.strategy.test;

import designpatterns.behavior11.strategy.behaviors.fly.impl.FlyRocketPowered;
import designpatterns.behavior11.strategy.customer.Duck;
import designpatterns.behavior11.strategy.customer.MallardDuck;
import designpatterns.behavior11.strategy.customer.ModelDuck;

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
