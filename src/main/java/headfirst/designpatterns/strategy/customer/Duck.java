package headfirst.designpatterns.strategy.customer;

import headfirst.designpatterns.strategy.behaviors.fly.FlyBehavior;
import headfirst.designpatterns.strategy.behaviors.quack.QuackBehavior;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Duck {
	// 组合
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public abstract void display();

	// 委托
	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
